public class Carta {
    
    private Seme seme;
    private Numero numero;
    
    public Carta (Numero numero, Seme seme) {
        this.numero = numero;
        this.seme = seme;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public Numero getNumero() {
        return numero;
    }

    public void setSeme(Seme seme) {
        this.seme = seme;
    }

    public Seme getSeme() {
        return seme;
    }
    
    public String toString() {
        return numero + " di " + seme;
    }
}