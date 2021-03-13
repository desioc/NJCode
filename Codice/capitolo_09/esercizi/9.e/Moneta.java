public class Moneta {

    public final static String VALUTA = "EURO";

    private final Valore valore;

    public Moneta(Valore valore) {
        this.valore = valore;
        System.out.println("Creata una " + getDescrizione());
    }

    public Valore getValore() {
        return valore;
    }

    public String getDescrizione() {
        String descrizione = "moneta da " + valore.getStringaDescrittiva()
                + VALUTA;
        return descrizione;
    }
}
