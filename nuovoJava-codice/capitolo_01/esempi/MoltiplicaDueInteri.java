import java.util.Scanner;

public class MoltiplicaDueInteri {
    public static void main(String args[]) {
        System.out.println("Ciao, so moltiplicare due numeri interi.");
        System.out.println("Scrivi il primo valore e batti invio");
        Scanner keyboardScanner = new Scanner(System.in);
        int input1;
        input1 = keyboardScanner.nextInt();
        System.out.println("Scrivi il secondo valore e batti invio");
        int input2 = keyboardScanner.nextInt();
        int risultato = input1 * input2;
        System.out.println("Il risultato è:");
        System.out.println(risultato);
    }
}