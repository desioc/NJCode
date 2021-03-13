public class TestRisultato {
    public static void main(String args[]) {
        Risultato risultato = new Risultato(5.0F);
        risultato.stampa();
        CambiaRisultato cr = new CambiaRisultato();
        cr.cambiaRisultato(risultato);
        risultato.stampa();
    }
}