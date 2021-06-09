public class OggettoModificabile {
    private String titolo;
    public OggettoModificabile (String titolo){
        this.titolo = titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public String toString() {
        return titolo;
    }
}