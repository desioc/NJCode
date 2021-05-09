public class Libro {
    private String titolo;
    private String autore;
    private String editore;
    private int numeroPagine;
    private int prezzo;
    
    public Libro (String titolo, String autore){
        this(titolo); 
        setAutore(autore);
    }
    
    public Libro (String titolo) {
        this.titolo = titolo;
    }
    
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public String getEditore() {
        return editore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getAutore() {
        return autore;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }
}