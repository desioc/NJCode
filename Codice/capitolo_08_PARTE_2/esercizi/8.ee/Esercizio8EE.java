import java.util.Scanner;
import java.util.InputMismatchException;

public class Esercizio8EE {
    private Scanner scanner;

    public Esercizio8EE() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        Punto p1 = getPunto("1");
        Punto p2 = getPunto("2");
        stampaDistanza(p1, p2) ;
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
        Punto p = new Punto(x,y);
        System.out.println("Creato punto:"+ p);
        return p;
    }

    public void stampaDistanza(Punto p1, Punto p2) {
        System.out.println("Distanza tra i punti: "+ p1 +" e "+ p2 +" = "+ Righello.calcolaDistanza(p1,p2));
    }

    public static void main(String args[]) {
        Esercizio8EE esercizio8EE = new Esercizio8EE();
        esercizio8EE.start();
    }
}