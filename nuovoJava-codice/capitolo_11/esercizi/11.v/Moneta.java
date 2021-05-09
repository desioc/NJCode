import java.util.Objects;

public class Moneta {
    public final static String VALUTA ="EURO";

    static {
        System.out.println("Caricata la classe Moneta con valuta = "+ VALUTA);
    }

    private final Valore valore;

    public Moneta(Valore valore) {
        this.valore = valore;
        System.out.println("Creata una "+ getDescrizione());
    }

    public Valore getValore() {
        return valore;
    }

    public String getDescrizione() {
        String descrizione ="moneta da "+ valore.getStringaDescrittiva()
        + VALUTA;
        return descrizione;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Moneta other = (Moneta) obj;
        if (this.valore != other.valore) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.valore);
        return hash;
    }
}