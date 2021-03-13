public class Carattere {
    private String tipo;
    private int dimensione;

    public Carattere (String tipo) {
        this(tipo, 12);
    }

    public Carattere (String tipo, int dimensione) {
        setTipo(tipo);
        setDimensione(dimensione);
    }

    public void setDimensione(int dimensione) {
        this.dimensione = dimensione;
    }

    public int getDimensione() {
        return dimensione;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}