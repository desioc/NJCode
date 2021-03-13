public record Quadro(String titolo, String autore, int prezzo) { }

/*

public final class Quadro {
    private String titolo;
    private String autore;
    private int prezzo;

    public Quadro(String titolo, String autore, int prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public int getPrezzo() {
        return prezzo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((autore == null) ? 0 : autore.hashCode());
        result = prime * result + prezzo;
        result = prime * result + ((titolo == null) ? 0 : titolo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Quadro other = (Quadro) obj;
        if (autore == null) {
            if (other.autore != null)
                return false;
        } else if (!autore.equals(other.autore))
            return false;
        if (prezzo != other.prezzo)
            return false;
        if (titolo == null) {
            if (other.titolo != null)
                return false;
        } else if (!titolo.equals(other.titolo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Quadro [titolo=" + titolo + ", autore=" + autore + ", prezzo=" 
            + prezzo + "]" ;
    }
}


*/