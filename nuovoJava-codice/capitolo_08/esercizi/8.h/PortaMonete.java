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
    public PortaMonete(int... valori) {
        try {
            int numeroMonete = valori.length;
            for (int i = 0; i < numeroMonete; i++) {
                if (i >= 10) {
                    throw new PortaMonetePienoException (
                        "Sono state inserite solo le prime 10 monete!");
                }
                monete[i] = new Moneta(valori[i]);
            }
    //  } catch (PortaMonetePienoException | NullPointerException exc) {
        } catch (PortaMonetePienoException exc) {
            System.out.println(exc.getMessage());
        } catch (NullPointerException exc) {
            System.out.println("Il portamonete è stato creato vuoto");
        }
    }
    
    /**
     * Aggiunge una moneta al portamonete. Se questo è pieno la moneta non è 
     * aggiunta e viene stampato un errore significativo.
     * 
     * @param moneta 
     *          la moneta da aggiungere.
     */
    public void aggiungi(Moneta moneta) throws PortaMonetePienoException {
        try {
            System.out.println("Proviamo ad aggiungere una " + 
                    moneta.getDescrizione());
        } catch (NullPointerException exc) {
            throw new NullPointerException("La moneta passata era null");
        }
        int indiceLibero = primoIndiceLibero();
        if (indiceLibero == -1) {
            throw new PortaMonetePienoException("Portamonete pieno! La moneta "
                    + moneta.getDescrizione() + " non è stata aggiunta...");
        } else {
            monete[indiceLibero] = moneta;
            System.out.println("E' stata aggiunta una " + 
                    moneta.getDescrizione());
        }
    }
    
    /**
     * Restituisce il primo indice libero nell'array delle monete o -1 se il
     * portamonete è pieno.
     * 
     * @return 
     *          il primo indice libero nell'array delle monete o -1 se il
     *          portamonete è pieno.
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
    
    /**
     * Esegue un prelievo della moneta specificata dal portamonete corrente. Nel
     * caso non sia presente la moneta specificata, un errore significativo 
     * verrà stampato e null verrà ritornato.
     * 
     * @param moneta
     *          la moneta da prelevare.
     * @return 
     *          la moneta trovata o null se non trovata.
     */
    public Moneta preleva(Moneta moneta) {
        System.out.println("Proviamo a prelevare una "  + 
            moneta.getDescrizione());
        Moneta monetaTrovata = null;
        int indiceMonetaTrovata = indiceMonetaTrovata(moneta);
        if (indiceMonetaTrovata == -1) {
            System.out.println("Moneta non trovata!");
        } else {
            monetaTrovata = moneta;
            monete[indiceMonetaTrovata] = null;
            System.out.println("Una " + moneta.getDescrizione() + " prelevata");
        }
        return monetaTrovata;
    }    
    
    private int indiceMonetaTrovata(Moneta moneta) {
        int indiceMonetaTrovata = -1;
        for (int i = 0; i < 10; i++) {
            if (monete[i] == null) {
                continue;
            }
            int valoreMonetaNelPortaMoneta = monete[i].getValore();
            int valore = moneta.getValore();
            if (valore == valoreMonetaNelPortaMoneta) {
                indiceMonetaTrovata = i;
                break;
            }
        }
        return indiceMonetaTrovata;
    }

}