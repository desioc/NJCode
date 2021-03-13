public record Articolo(String descrizione, double peso) implements Pesabile {   
    public double getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return descrizione;
    }
}