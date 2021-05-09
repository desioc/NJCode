import java.util.Scanner;

public class Esercizio12L {
    public static void main(String args[]) {
        Corridore corridore = new Corridore();
        corridore.inizia();
        Scanner scanner = new Scanner(System.in);
        boolean cicla = true;
        System.out.println(
           "Ciao allenatore, il corridore è a tua disposizione!");
        System.out.println("Scrivi i comandi e batti invio");
        System.out.println("(corri, cammina, fermati, basta)");
        while (cicla) {
            
            String comando = scanner.nextLine();
            switch (comando) {
                case"corri":
                    corridore.corri();
                break;
                case"cammina":
                    corridore.cammina();
                break;
                case"fermati":
                    corridore.fermati();
                break;
                case"basta":
                    corridore.basta();
                    cicla = false;
                break;
                default:
                break;
            }
        }
        try {
            Thread.sleep(2000);
        }
        catch (Exception exc) {
            assert false;
        }
        System.out.println("Fine allenamento");
    }
}