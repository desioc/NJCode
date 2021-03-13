
import java.util.ArrayList;

public class Cesta<F extends Frutta> {

    private ArrayList<F> frutta;

    public Cesta() {
        frutta = new ArrayList<>();
    }

    public ArrayList<F> getFrutta() {
        return frutta;
    }

    public void aggiungiFrutta(F frutto) throws PesoException {
        final int nuovoPeso = getPeso() + frutto.getPeso();
        if (nuovoPeso > 2000) {
            throw new PesoException("Troppo peso: " + nuovoPeso + " grammi!");
        }
        frutta.add(frutto);
        System.out.println(frutto.getClass().getName() + " da " + frutto.getPeso() + " grammi aggiunta alla cesta");
    }

    public int getPeso() {
        int peso = 0;
        for (F frutto : frutta) {
            peso += frutto.getPeso();
        }
        return peso;
    }
}
