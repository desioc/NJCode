import java.util.Scanner;
import java.util.InputMismatchException;

public class Esercizio8CC {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Inserisci coordinata x per il punto 1");
            int x1 = scanner.nextInt();
            System.out.println("Inserisci coordinata y per il punto 1");
            int y1 = scanner.nextInt();
            Punto p1 = new Punto(x1, y1);
            System.out.println("Creato punto:"+ p1);
            System.out.println("Inserisci coordinata x per il punto 2");
            int x2 = scanner.nextInt();
            System.out.println("Inserisci coordinata y per il punto 2");
            int y2 = scanner.nextInt();
            Punto p2 = new Punto(x2, y2);
            System.out.println("Creato punto:"+ p2);
            System.out.println("Distanza tra i punti: "+ p1 +" e "+ p2 +" = "+ Righello.calcolaDistanza(p1,p2));
        } catch (InputMismatchException exc) {
            System.out.println("Le coordinate devono essere di tipo intero!");
        }
    }
}