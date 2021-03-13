public enum Misura  implements Pesabile {
    SMALL(0.05), MEDIUM(0.1), LARGE(0.5), EXTRA_LARGE(0.07);
    private double peso;
    Misura(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
}