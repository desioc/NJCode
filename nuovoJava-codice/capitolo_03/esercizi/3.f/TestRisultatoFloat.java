public class TestRisultatoFloat {
    public static void main(String args[]) {
        float risultato = 5.0F;
        System.out.println(risultato);
        CambiaRisultato cr = new CambiaRisultato();
        risultato = cr.cambiaRisultato(risultato);
        System.out.println(risultato);
    }
}