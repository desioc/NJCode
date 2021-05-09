import java.util.Scanner;

public class Esercizio4Q {
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digita il numero di giorni passati dalla fine dell'ultima vacanza");
        int giorni = scanner.nextInt();
        System.out.println("Hai digitato " + giorni + " giorni!");
        int ore = giorni*24;
        int minuti = ore*60;
        System.out.println("Quindi sono passati " + minuti + " minuti!");
    }
}