/**
 * Astrae il concetto di portamonete che può contenere un numero limitato di
 * monete.
 * 
 * @author Claudio De Sio Cesari
 */
public class PortaMonete {

    /**
     * Un array che contiene un numero limitato di monete.
     */
    private final Moneta[] monete = new Moneta[10];

    /**
     * Crea un oggetto portamonete contenente monete i cui valori sono 
     * specificati dal varargs valori. 
     * 
     * @param valori
     *          un varargs di valori di monete.
     */
    public PortaMonete(int... valori){
        int numeroMonete = valori.length;
        for (int i = 0; i < numeroMonete; i++) {
            if (i >= 10) {
                System.out.println(
              "Sono state inserite solo le prime 10 monete!");
                break;
            }
            monete[i] = new Moneta(valori[i]);
        }    
    }
}