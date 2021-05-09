public record Quadro(String titolo, String autore, int prezzo) { 

    @Override 
    public String toString() {
        return "Il quadro " +  titolo + " di " + autore + " costa " + prezzo;
    }
}