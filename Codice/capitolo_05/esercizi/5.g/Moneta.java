/**
 * Questa classe astrae il concetto di Moneta.
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
    private final int valore;

    /**
     * Costruttore che prende in input il valore della moneta.
     *
     * @param valore il valore della moneta.
     */
    public Moneta(int valore) {
        this.valore = valore;
        System.out.println("Creata una moneta da " + 
            formattaUnitaDiMisura(valore) + VALUTA);
    }

    private static String formattaUnitaDiMisura(int valore) {
        return valore + (valore == 1 ?  " centesimo di " : " centesimi di ");
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
