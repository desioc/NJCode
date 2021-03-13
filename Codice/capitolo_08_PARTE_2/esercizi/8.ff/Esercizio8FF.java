import java.util.*;

public class Esercizio8FF {
    private Scanner scanner;

    public Esercizio8FF() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Definiamo un segmento specificando i due estremi:");
        Punto p1 = getPunto("1");
        Punto p2 = getPunto("2");
        stampa(new Segmento(p1, p2) );
    }

    private int getCoordinata(String nomeCoordinata, String nomePunto) {
        System.out.println("Inserisci coordinata "+ nomeCoordinata +" per l'estremo "+ nomePunto);
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
        System.out.println("Creato estremo:"+ p);
        return p;
    }

    public void stampa(Segmento segmento) {
        System.out.println(segmento);
    }

    public static void main(String args[]) {
        Esercizio8FF esercizio8FF = new Esercizio8FF();
        esercizio8FF.start();
    }
}