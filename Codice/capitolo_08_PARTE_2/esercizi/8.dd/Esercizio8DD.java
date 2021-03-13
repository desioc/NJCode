import java.util.Scanner;
import java.util.InputMismatchException;

public class Esercizio8DD {
    private Scanner scanner;

    public Esercizio8DD() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        try {
            Punto p1 = getPunto("1");
            Punto p2 = getPunto("2");
            stampaDistanza(p1, p2) ;
        }
        catch (InputMismatchException exc) {
            System.out.println("Le coordinate devono essere di tipo intero!");
        }
    }

    private int getCoordinata(String nomeCoordinata, String nomePunto) {
        System.out.println("Inserisci coordinata "+ nomeCoordinata +" per il punto "+ nomePunto);
        return scanner.nextInt();
    }

    private Punto getPunto(String nomePunto) {
        int x = getCoordinata("x", nomePunto);
        int y = getCoordinata("y", nomePunto);
        Punto p = new Punto(x,y);
        System.out.println("Creato punto: "+ p);
        return p;
    }

    public void stampaDistanza(Punto p1, Punto p2) {
        System.out.println("Distanza tra i punti: "+ p1 +" e "+ p2 +" = "+ Righello.calcolaDistanza(p1,p2));
    }

    public static void main(String args[]) {
        Esercizio8DD esercizio8DD = new Esercizio8DD();
        esercizio8DD.start();
    }
}