import java.util.*;
import javax.swing.*;

public class Esercizio8HH {
    private Scanner scanner;
    private CartesianPlane cartesianPlane;
    private static int contatore = 1;

    public Esercizio8HH() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        SwingUtilities.invokeLater(() -> cartesianPlane = new CartesianPlane());
        while(true) {
            Punto p1 = getPunto("P"+(contatore++));
            cartesianPlane.drawPoint(p1);
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
        Esercizio8HH esercizio8HH = new Esercizio8HH();
        esercizio8HH.start();
    }
}