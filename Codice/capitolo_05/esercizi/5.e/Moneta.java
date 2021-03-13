/**
 * Questa classe astrae il concetto di Moneta (esercizio 5.e)
 *
 * @author Claudio De Sio Cesari
 */
public class Moneta {

    /**
     * La valuta è una costante settata al valore EURO.
     */
    public final static String VALUTA = "EURO";

    /**
     * Rappresenta il valore della moneta in centesimi.
     */
    private int valore;

    /**
     * Costruttore che prende in input il valore della moneta.
     *
     * @param valore il valore della moneta.
     */
    public Moneta(int valore) {
        this.valore = valore;
        System.out.println("Creata una moneta da " + valore + " centesimi");
    }

    /**
     * Setta la variabile d'istanza valore.
     *
     * @param valore contiene il valore a cui deve essere settato il valore
     * della variabile d'istanza valore.
     */
    public void setValore(int valore) {
        this.valore = valore;
    }
    /**
     * Restituisce il valore della variabile d'istanza valore.
     * 
     * @return
     *          il valore della variabile d'istanza valore.
     */ 
    public int getValore() {
        return valore;
    }
}