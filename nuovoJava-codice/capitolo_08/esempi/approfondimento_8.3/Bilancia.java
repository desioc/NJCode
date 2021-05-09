public class Bilancia {
    private double peso;
    public Bilancia() {
        azzeraLancetta();
        assert lancettaAzzerata();// invariante di classe
    }
    private void setPeso(double grammi) {
        assert grammi > 0; // pre-condizione
        peso = grammi;
    }
    private double getPeso() {
        return peso;
    }
    public void pesa(double grammi) {
        if (grammi <= 0) {
            throw new RuntimeException("Grammi <= 0! ");
        }
        setPeso(grammi);
        mostraPeso();
        azzeraLancetta();
        assert lancettaAzzerata(); // invariante di classe
    }
    private void mostraPeso() {
        System.out.println("Il peso è di " + peso + " grammi");
    }
    private void azzeraLancetta() {
        setPeso(0);
    }
    private boolean lancettaAzzerata () {
        return peso == 0;
    }
}