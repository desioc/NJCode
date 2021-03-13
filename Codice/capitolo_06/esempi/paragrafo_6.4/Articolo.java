public class Articolo implements Pesabile {
    private double peso;
    private String descrizione;

    public Articolo (String descrizione, double peso) {
        setDescrizione(descrizione);
        setPeso(peso);
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}