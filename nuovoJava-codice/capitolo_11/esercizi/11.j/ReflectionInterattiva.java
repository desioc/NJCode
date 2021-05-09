import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflectionInterattiva {

    public static void main(String args[]) { 
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        System.out.println("Digita il nome di una classe presente nella"
                + " cartella corrente e batti enter, oppure scrivi \"fine\""
                + " per terminare il programma");
        while (!(stringa = scanner.next()).equals("fine")) {
            System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
            try {
                stampaMetodi(stringa);
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Fine programma!");
    }

    private static void stampaMetodi(String stringa) throws ClassNotFoundException {
        Class objectClass = Class.forName(stringa);
        Method[] methods = objectClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

    }
}