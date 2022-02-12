/**
 * Astrae il concetto di portamonete che pu� contenere un numero limitato di
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
    public PortaMonete(int[] valori){
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
    
    /**
     * Aggiunge una moneta al portamonete. Se questo � pieno la moneta non � 
     * aggiunta e viene stampato un errore significativo.
     * 
     * @param moneta 
     *          la moneta da aggiungere.
     */
    public void aggiungi(Moneta moneta) {
        System.out.println("Proviamo ad aggiungere una " + 
                    moneta.getDescrizione());
        int indiceLibero = primoIndiceLibero();
        if (indiceLibero == -1) {
            System.out.println("Portamonete pieno! La moneta " + 
                    moneta.getDescrizione() + " non � stata aggiunta...");
        } else {
            monete[indiceLibero] = moneta;
            System.out.println("E' stata aggiunta una " + 
                    moneta.getDescrizione());
        }
    } 
    
    /**
     * Restituisce il primo indice libero nell'array delle monete o -1 se il
     * portamonete � pieno.
     * 
     * @return 
     *          il primo indice libero nell'array delle monete o -1 se il
     *          portamonete � pieno.
     */
    private int primoIndiceLibero() {
        int indice = -1;
        for (int i = 0; i < 10; i++) {
            if (monete[i] == null) {
                indice = i;
                break;
            }
        }
        return indice;
    }
    /**
     * Stampa il contenuto del portamonete.
     */
    public void stato() {
        System.out.println("Il portamonete contiene:");
        for (Moneta moneta : monete) {
            if (moneta == null) {
                break;
            }
            System.out.println("Una " + moneta.getDescrizione());
        }
    }
}