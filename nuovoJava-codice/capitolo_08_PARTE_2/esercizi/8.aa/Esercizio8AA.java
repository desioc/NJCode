public class Esercizio8AA {
    private final static double RISULTATO_CORRETTO = 2;
    public static void main(String args[]) {
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(2,0);
        double distanza = Righello.calcolaDistanza(p1,p2);
        System.out.println("Distanza tra i punti: " + p1 + " e " + p2 + " = " + distanza);
        assert distanza == RISULTATO_CORRETTO : "Errore! Il risultato dovrebbe essere " 
            + RISULTATO_CORRETTO;
        System.out.println("Distanza corretta!");
    }
}