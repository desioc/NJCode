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

    public void stampaDettagli() {
        System.out.println(getNome());
        System.out.println(getIndirizzo());
        System.out.println(getNumeroDiTelefono());
        System.out.println(getSuoneria());
        System.out.println();
    }    
}