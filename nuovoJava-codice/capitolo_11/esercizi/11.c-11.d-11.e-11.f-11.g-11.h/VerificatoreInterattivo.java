package test;

import eccezioni.AnnotationException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;
import metadati.Bean;
import metadati.Breve;
import metadati.Specifica;

public class VerificatoreInterattivo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        System.out.println("Digita il nome di un file java presente nella"
                + " cartella corrente e batti enter, oppure scrivi \"fine\" "
                + "per terminare il programma");
        while (!(stringa = scanner.next()).equals("fine")) {
            System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
            try {
                verificaClasse(stringa);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Fine programma!");
    }

    private static void verificaClasse(String stringa) throws Exception {
        Class<?> objectClass = Class.forName(stringa);
        //verificaBreve(stringa, objectClass);
        //verificaSpecifica(stringa, objectClass);
        verificaBean(stringa, objectClass);
    }

    private static void verificaBreve(String stringa, Class<?> objectClass) throws AnnotationException {
        try {
            System.out.println("Inizio verifica annotazione Breve per " + stringa);
            Annotation breve = objectClass.getAnnotation(Breve.class);
            if (breve != null) {
                Method[] methods = objectClass.getDeclaredMethods();
                final int numeroMetodi = methods.length;
                if (numeroMetodi > 3) {
                    throw new AnnotationException("Ci sono " + numeroMetodi
                            + " metodi nella classe " + stringa);
                }
                System.out.println("Classe " + stringa + " corretta!\nlista metodi:");
                for (Method method : methods) {
                    System.out.println(method);
                }
            } else {
                System.out.println("Questa classe non è annotata con @Breve");
            }
        } finally {
            System.out.println("Fine verifica annotazione Breve per " + stringa);
        }
    }

    private static void verificaSpecifica(String stringa, Class<?> objectClass) throws AnnotationException {
        try {
            System.out.println("Inizio verifica annotazione Specifica per "
                    + stringa);
            Specifica specifica = objectClass.getAnnotation(Specifica.class);
            if (specifica != null) {
                int numeroVariabiliDaSpecifica = specifica.value();
                Field[] fields = objectClass.getDeclaredFields();
                final int numeroVariabili = fields.length;
                if (numeroVariabili != numeroVariabiliDaSpecifica) {
                    throw new AnnotationException("Ci sono " + numeroVariabili
                            + " variabili nella classe " + stringa
                            + " ma dovrebbero essere " + numeroVariabiliDaSpecifica);
                }
                System.out.println("Classe " + stringa + " corretta!\nlista variabili:");
                for (Field field : fields) {
                    System.out.println(field);
                }
            } else {
                System.out.println("Questa classe non è annotata con @Specifica");
            }
        } finally {
            System.out.println("Fine verifica annotazione Specifica per " + stringa);
        }
    }

    private static void verificaBean(String stringa, Class<?> objectClass) throws AnnotationException {
        try {
            System.out.println("Inizio verifica annotazione @Bean per "
                    + stringa);
            Bean bean = objectClass.getAnnotation(Bean.class);
            if (bean != null) {
                controlloNumeroVariabili(bean, objectClass, stringa);
                controlloNumeroMetodi(bean, objectClass, stringa);
                controlloCostruttoreSenzaParametro(objectClass, stringa);
                controlloIncapsulamento(objectClass, stringa);
            } else {
                System.out.println("Questa classe non è annotata con @Bean");
            }
        } finally {
            System.out.println("Fine verifica annotazione Bean per " + stringa);
        }
    }

    private static void controlloNumeroVariabili(Bean bean, Class<?> objectClass, String stringa) throws AnnotationException {
        int numeroMinimoVariabili = bean.numeroMinimoVariabili();
        Field[] fields = objectClass.getDeclaredFields();
        final int numeroVariabili = fields.length;
        if (numeroVariabili < numeroMinimoVariabili) {
            throw new AnnotationException("Ci sono " + numeroVariabili
                    + " variabili nella classe " + stringa
                    + " ma dovrebbero essere almeno " + numeroMinimoVariabili);
        }
        System.out.println("Classe " + stringa + " numero variabili ok!\nlista variabili:");
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    private static void controlloNumeroMetodi(Bean bean, Class<?> objectClass, String stringa) throws AnnotationException {
        int numeroMassimoMetodi = bean.numeroMassimoMetodi();
        Method[] methods = objectClass.getDeclaredMethods();
        final int numeroMetodi = methods.length;
        if (numeroMetodi > numeroMassimoMetodi) {
            throw new AnnotationException("Ci sono " + numeroMetodi
                    + " metodi nella classe " + stringa
                    + " ma dovrebbero essere al massimo " + numeroMassimoMetodi);
        }
        System.out.println("Classe " + stringa + " numero metodi ok!\nlista metodi:");
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    private static void controlloCostruttoreSenzaParametro(Class<?> objectClass, String stringa) throws AnnotationException {
        try {
            Constructor<?> constructor = objectClass.getConstructor();
            System.out.println("Classe " + stringa
                    + " costruttore senza parametri presente!:");
            System.out.println(constructor);
        } catch(NoSuchMethodException exc) {
            throw new AnnotationException(
                        "Niente costruttore senza parametri!");
        }
    }

    private static void controlloIncapsulamento(Class<?> objectClass, String stringa) throws AnnotationException {
        String nomeVariabile =  null;
        try {
            Field[] fields = objectClass.getDeclaredFields();
            for (Field field : fields) {
                nomeVariabile = field.getName();
                final Class<?> type = field.getType();
                final Method setMethod = objectClass.getDeclaredMethod("set" + capitalize(nomeVariabile), type);
                final Method getMethod = objectClass.getDeclaredMethod("get" + capitalize(nomeVariabile));
            }
            System.out.println("Classe " + stringa + " incapsulamento ok!");
        } catch (NoSuchMethodException exc) {
            throw new AnnotationException("Variabile " + nomeVariabile +
                " non incapsulata correttamente nella classe " + stringa);            
        }
    }

    private static String capitalize(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}