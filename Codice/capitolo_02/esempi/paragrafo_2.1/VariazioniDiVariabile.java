public class VariazioniDiVariabile {
    public static void main(String args[]) {
        double tassoDiConversione = 1.1;
        stampaTassoDiConversione(tassoDiConversione);
        tassoDiConversione = tassoDiConversione + 0.2;
        stampaTassoDiConversione(tassoDiConversione);
        tassoDiConversione = tassoDiConversione - 0.3;
        stampaTassoDiConversione(tassoDiConversione);
    }
    
    public static void stampaTassoDiConversione(double tasso) {
        System.out.println("Valore attuale del tasso di conversione");
        System.out.println(tasso);
    }
}


/* PRIMA VERSIONE

public class VariazioniDiVariabile {
    public static void main(String args[]) {
        double tassoDiConversione = 1.1;
        System.out.println("Valore attuale del tasso di conversione");
        System.out.println(tassoDiConversione);
        tassoDiConversione = tassoDiConversione + 0.2;
        System.out.println("Valore attuale del tasso di conversione");
        System.out.println(tassoDiConversione);
        tassoDiConversione = tassoDiConversione - 0.3;
        System.out.println("Valore attuale del tasso di conversione");
        System.out.println(tassoDiConversione);
    }
}

*/