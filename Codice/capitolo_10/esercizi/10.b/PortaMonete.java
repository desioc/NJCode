import java.util.ArrayList;
import java.util.List;

/**
 * Astrae il concetto di portamonete che può contenere un numero limitato di
 * monete.
 *
 * @author Claudio De Sio Cesari
 */
public class PortaMonete {

    /**
     * Costante che rappresenta il numero massimo di monete che questo 
     * portamonete può contenere.
     */    
     private static final int DIMENSIONE = 10;

    /**
     * Un array list che contiene un numero limitato di monete.
     */
    private final List<Moneta> monete = new ArrayList<>(DIMENSIONE);

    /**
     * Crea un oggetto portamonete contenente monete i cui valori sono
     * specificati dal varargs valori. Se
     * il numero di elementi del varargs valori è maggiore del numero massimo di
     * monete che il portamonete corrente può contenere, allora viene gestita
     * un’eccezione
     *
     * @param valori un varargs di valori di monete.
     */
    public PortaMonete(Valore... valori) {
        assert monete.size() <= DIMENSIONE;
        try {
            int numeroMonete = valori.length;
            for (int i = 0; i < numeroMonete; i++) {
                if (i >= DIMENSIONE) {
                    throw new PortaMonetePienoException(
                       "Sono state inserite solo le prime + " + DIMENSIONE 
                           + " monete!");
                }
                monete.add(new Moneta(valori[i]));
            }
        } catch (PortaMonetePienoException exc) {
            System.out.println(exc.getMessage());
        } catch (NullPointerException exc) {
            System.out.println("Il portamonete è stato creato vuoto");
        }
        assert monete.size() <= DIMENSIONE;
    }

    /**
     * Aggiunge una moneta al portamonete. Se questo è pieno la moneta non è
     * aggiunta e viene stampato un errore significativo.
     *
     * @param moneta la moneta da aggiungere.
     * @throws PortaMonetePienoException
     */
    public void aggiungi(Moneta moneta) throws PortaMonetePienoException {
        try {
            System.out.println("Proviamo ad aggiungere una " + 
                    moneta.getDescrizione());
        } catch (NullPointerException exc) {
            throw new MonetaNullException();
        }
        int indiceLibero = primoIndiceLibero();
        if (indiceLibero == -1) {
            throw new PortaMonetePienoException("Portamonete pieno! La moneta "
                    + moneta.getDescrizione() + " non è stata aggiunta...");
        } else {
            monete.set(indiceLibero, moneta);
            System.out.println("E' stata aggiunta una " + 
                    moneta.getDescrizione());
        }
    }

    /**
     * Esegue un prelievo della moneta specificata dal portamonete corrente. Nel
     * caso non sia presente la moneta specificata, un errore significativo
     * verrà stampato e null verrà ritornato.
     *
     * @param moneta la moneta da prelevare.
     * @return la moneta trovata o null se non trovata.
     * @throws MonetaNonTrovataException
     */
    public Moneta preleva(Moneta moneta) throws MonetaNonTrovataException {
        try {
            System.out.println("Proviamo a prelevare una " + 
                    moneta.getDescrizione());
        } catch (NullPointerException exc) {
            throw new MonetaNullException();
        }
        Moneta monetaTrovata = null;
        int indiceMonetaTrovata = indiceMonetaTrovata(moneta);
        if (indiceMonetaTrovata == -1) {
            throw new MonetaNonTrovataException("Moneta non trovata!");
        } else {
            monetaTrovata = moneta;
            monete.set(indiceMonetaTrovata, moneta);
            System.out.println("Una " + moneta.getDescrizione() + " prelevata");
        }
        return monetaTrovata;
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
     * Restituisce il primo indice libero nell'array delle monete o -1 se il
     * portamonete è pieno.
     *
     * @return il primo indice libero nell'array delle monete o -1 se il
     * portamonete è pieno.
     */
    private int primoIndiceLibero() {
        int indice = monete.indexOf(null);
        return indice;
    }

    private int indiceMonetaTrovata(Moneta moneta) {
        int indiceMonetaTrovata = -1;
        final int size = monete.size();
        for (int i = 0; i < size; i++) {
            if (monete.get(i) == null) {
                continue;
            }
            Valore valoreMonetaNelPortaMoneta = monete.get(i).getValore();
            Valore valore = moneta.getValore();
            if (valore == valoreMonetaNelPortaMoneta) {
                indiceMonetaTrovata = i;
                break;
            }
        }
        return indiceMonetaTrovata;
    }
}  