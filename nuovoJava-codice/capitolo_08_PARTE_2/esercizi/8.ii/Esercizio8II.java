import java.util.*;
import javax.swing.*;

public class Esercizio8II {
    private Scanner scanner;
    private CartesianPlane cartesianPlane;
    private static int contatore = 1;

    public Esercizio8II() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        SwingUtilities.invokeLater(() -> cartesianPlane = new CartesianPlane());
        while(true) {
            System.out.println("Definiamo un segmento");
            Punto p1 = getPunto("P"+(contatore++));
            Punto p2 = getPunto("P"+(contatore++));
            Segmento s1 = new Segmento(p1, p2);
            cartesianPlane.drawSegment(s1);
        }
    }

    private int getCoordinata(String nomeCoordinata, String nomePunto) {
        System.out.println("Inserisci coordinata "+ nomeCoordinata +" per il punto "+ nomePunto);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Coordinata non valida "+  scanner.next() +"!, Le coordinate devono essere di tipo intero! Prego reinserire");
            }
        }
        return -1;
    }

    private Punto getPunto(String nomePunto) {
        int x = getCoordinata("x", nomePunto);
        int y = getCoordinata("y", nomePunto);
        Punto p = new Punto(nomePunto, x,y);
        System.out.println("Creato punto:"+ p);
        return p;
    }

    public static void main(String args[]) {
        Esercizio8II esercizio8II = new Esercizio8II();
        esercizio8II.start();
    }
}