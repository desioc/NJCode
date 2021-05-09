import java.util.Scanner;

public class SommaTreInteri {
    public static void main(String args[]) {
        System.out.println("Ciao, so sommare tre numeri interi.");
        System.out.println("Scrivi il primo valore e batti invio");
        Scanner keyboardScanner = new Scanner(System.in);
        int operatore1 = keyboardScanner.nextInt();
        System.out.println("Scrivi il secondo valore e batti invio");
        int operatore2 = keyboardScanner.nextInt();
        System.out.println("Scrivi il terzo valore e batti invio");
        int operatore3 = keyboardScanner.nextInt();
        int risultato = operatore1 + operatore2 + operatore3;
        System.out.println("Il risultato è:");
        System.out.println(risultato);
    }
}