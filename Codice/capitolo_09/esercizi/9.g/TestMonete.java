public class TestMonete {

    public static void main(String args[]) {

        Moneta monetaDaVentiCentesimi = new Moneta(Valore.VENTI_CENTESIMI);
        Moneta monetaDaUnCentesimo = new Moneta(Valore.UN_CENTESIMO);
        Moneta monetaDaUnEuro = new Moneta(Valore.UN_EURO);
        // Creiamo un portamonete con 11 monete
        PortaMonete portaMoneteInsufficiente = new 
                PortaMonete(Valore.DUE_CENTESIMI,
                Valore.CINQUE_CENTESIMI, Valore.UN_EURO, Valore.DIECI_CENTESIMI,
                Valore.CINQUANTA_CENTESIMI, Valore.DIECI_CENTESIMI, 
                Valore.UN_EURO, Valore.DUE_EURO, Valore.DIECI_CENTESIMI, 
                Valore.CINQUE_CENTESIMI, Valore.DUE_CENTESIMI);
        // Creiamo un portamonete con 8 monete
        PortaMonete portaMonete = new PortaMonete(Valore.DUE_CENTESIMI,
                Valore.CINQUE_CENTESIMI, Valore.UN_EURO, Valore.DIECI_CENTESIMI,
                Valore.CINQUANTA_CENTESIMI, Valore.DIECI_CENTESIMI,
                Valore.UN_EURO, Valore.DUE_EURO);
        portaMonete.stato();
        try {
            // Aggiungiamo una moneta da 20 centesimi
            portaMonete.aggiungi(monetaDaVentiCentesimi);
        } catch (PortaMonetePienoException | MonetaNullException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            // Aggiungiamo la decima moneta da 1 centesimo.
            portaMonete.aggiungi(monetaDaUnCentesimo);
        } catch (PortaMonetePienoException | MonetaNullException exc) {
            System.out.println(exc.getMessage());
        }
        try {
        // Aggiungiamo l'undicesima moneta (dovremmo ottenere un errore e 
        //la moneta non sarà aggiunta)
            portaMonete.aggiungi(monetaDaUnEuro);
        } catch (PortaMonetePienoException | MonetaNullException exc) {
            System.out.println(exc.getMessage());
        }// Valutiamo lo stato del portamonete.
        portaMonete.stato();
        try {
            // preleviamo 20 centesimi
            portaMonete.preleva(monetaDaVentiCentesimi);
        } catch (MonetaNonTrovataException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            // Aggiungiamo l'undicesima moneta (dovremmo ottenere un 
            //errore e la moneta non sarà aggiunta)
            portaMonete.aggiungi(monetaDaUnEuro);
        } catch (PortaMonetePienoException | MonetaNullException exc) {
            System.out.println(exc.getMessage());
        }
        portaMonete.stato();
        //il prossimo esempio non è più riproducibile
//        try {
//            
//Cerchiamo una moneta non esistente (dovremmo ottenere una stampa di errore)
//            
//            portaMonete.preleva(new Moneta(7));
//        } catch (MonetaNonTrovataException exc) {
//            System.out.println(exc.getMessage());
//        }
        //testiamo il passaggio di null al costruttore del porta monete
        PortaMonete portaMoneteEccezione = new PortaMonete(null);
        portaMonete.stato();
        try {
            // proviamo ad aggiungere null
            portaMonete.aggiungi(null);
        } catch (PortaMonetePienoException | MonetaNullException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            //Proviamo a prelevare una moneta null
            portaMonete.preleva(null);
        } catch (MonetaNonTrovataException | MonetaNullException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
