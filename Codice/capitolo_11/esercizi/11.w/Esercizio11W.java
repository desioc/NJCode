import java.lang.reflect.*;

public class Esercizio11W {
    public static void main(String args[]) throws Exception {
        Class<ClasseConMembriPrivati> classe = ClasseConMembriPrivati.class;
        ClasseConMembriPrivati oggetto = classe.getDeclaredConstructor().newInstance();
        /* Field variabilePrivata = classe.getField("variabilePrivata");
        variabilePrivata.setAccessible(true);
        variabilePrivata.set(oggetto, "Variabile privata hackerata!"); 
        System.out.println(variabilePrivata.get(oggetto));*/
        Method metodoPrivata = classe.getMethod("metodoPrivato");
        metodoPrivata.setAccessible(true);
        metodoPrivata.invoke(oggetto);
    }
}