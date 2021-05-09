package libreria.dati;

public abstract class Articolo {
    private static final char VALUTA ='€';
    private String id;
    private String titolo;
    private String nome;
    private int prezzo;
    private String genere;

    public Articolo(String id, String titolo, String nome, int prezzo, String genere) {
        super();
        setId(id);
        setTitolo(titolo);
        setNome(nome);
        setPrezzo(prezzo);
        setGenere(genere);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        this.genere = genere;
    }

    public String toString() {
        return  ": (" + getId() + ") " + getTitolo() +
            " di "+ getNome() + ", " + getGenere() + ", " + getPrezzo() + " " + VALUTA;
    }
}