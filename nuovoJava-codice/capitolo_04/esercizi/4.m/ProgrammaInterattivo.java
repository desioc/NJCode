import java.util.Scanner;

public class ProgrammaInterattivo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String stringa = "";
        System.out.println("Digita qualcosa e batti enter, oppure scrivi \"fine\" per terminare il programma");
        while(!(stringa = scanner.next()).equals("fine")) {
            System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
        }
        System.out.println("Fine programma!");
    }
}