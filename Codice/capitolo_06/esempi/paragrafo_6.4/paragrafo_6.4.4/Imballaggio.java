public record Imballaggio(Articolo articolo, double peso) implements Pesabile {
    public double getPeso() {
        return peso + articolo.getPeso();
    }
}