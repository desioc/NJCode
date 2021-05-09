
import java.util.Scanner;

public class CompilatoreInterattivo {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        System.out.println("Digita il nome di un file java presente nella "
                + " cartella corrente e batti enter, oppure scrivi \"fine\" "
                + "per terminare il programma");
        while (!(stringa = scanner.next()).equals("fine")) {
            System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
            try {
                compilaClasse(stringa);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Fine programma!");
    }

    private static void compilaClasse(String stringa) throws Exception {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("javac " + stringa);
        final int exitValue = process.waitFor();
        System.out.println(exitValue == 0 ? stringa + " compilato!" : "Impossibile compilare " + stringa);
    }
}