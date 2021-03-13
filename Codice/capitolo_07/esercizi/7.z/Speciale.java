package rubrica.dati;

public class Speciale extends Contatto {
    private String suoneria;

    public Speciale(String nome, String numeroDiTelefono, String indirizzo,
    String suoneria) {
        super(nome, numeroDiTelefono, indirizzo);
        setSuoneria(suoneria);
    }

    public String getSuoneria() {
        return suoneria;
    }

    public void setSuoneria(String suoneria) {
        this.suoneria = suoneria;
    }

    @Override
    public String toString() {
        return  super.toString() + "\nSuoneria="+ suoneria;
    }
}