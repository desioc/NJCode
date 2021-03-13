public class Libro {
    private String isbn;
    private String titolo;
    private String autore;
    private int prezzo;
    private String genere;

    public Libro(String isbn, String titolo, String autore, int prezzo, String genere) {
        setIsbn(isbn);
        setTitolo(titolo);
        setAutore(autore);
        setPrezzo(prezzo);
        setGenere(genere);
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String titolo) {
        this.isbn = isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        if (GenereUtils.isGenereValido(genere)) {
            this.genere = genere;
        } else {
            GenereUtils.stampaErrore(genere);
        }
    }
}