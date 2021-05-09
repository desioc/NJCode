public class PortaMonete {

    private static final int DIMENSIONE = 10;
    private final Moneta[] monete = new Moneta[DIMENSIONE];

    
    public PortaMonete(Valore... valori) {
        assert monete.length == DIMENSIONE;
        try {
            int numeroMonete = valori.length;
            for (int i = 0; i < numeroMonete; i++) {
                if (i >= DIMENSIONE) {
                    throw new PortaMonetePienoException(
                      "Sono state inserite solo le prime + " 
                      + DIMENSIONE + " monete!");
                }
                monete[i] = new Moneta(valori[i]);
            }
   //   } catch (PortaMonetePienoException | NullPointerException exc) {
        } catch (PortaMonetePienoException exc) {
            System.out.println(exc.getMessage());
        } catch (NullPointerException exc) {
            System.out.println("Il portamonete è stato creato vuoto");
        }
        assert monete.length == DIMENSIONE;
    }

    
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
            monete[indiceLibero] = moneta;
            System.out.println("E' stata aggiunta una " + 
                    moneta.getDescrizione());
        }
    }

    
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
            monete[indiceMonetaTrovata] = null;
            System.out.println("Una " + moneta.getDescrizione() + " prelevata");
        }
        return monetaTrovata;
    }

    public void stato() {
        System.out.println("Il portamonete contiene:");
        for (Moneta moneta : monete) {
            if (moneta == null) {
                break;
            }
            System.out.println("Una " + moneta.getDescrizione());
        }
    }

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

    private int indiceMonetaTrovata(Moneta moneta) {
        int indiceMonetaTrovata = -1;
        for (int i = 0; i < 10; i++) {
            if (monete[i] == null) {
                continue;
            }
            Valore valoreMonetaNelPortaMoneta = monete[i].getValore();
            Valore valore = moneta.getValore();
            if (valore == valoreMonetaNelPortaMoneta) {
                indiceMonetaTrovata = i;
                break;
            }
        }
        return indiceMonetaTrovata;
    }
}
