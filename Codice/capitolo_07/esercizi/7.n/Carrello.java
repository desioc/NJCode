package libreria.dati;

import java.util.ArrayList;
import java.util.List;

public class Carrello {
    private static final int MASSIMO_NUMERO_DI_ARTICOLI = 4;
    private Articolo[] articoli;

    public Carrello() {
        articoli = new Articolo[MASSIMO_NUMERO_DI_ARTICOLI];
    }

    public void aggiungi(Articolo articolo) {
        for (int i = 0; i < articoli.length; i++) {
            if (articoli[i]==null) {
                articoli[i] = articolo;
                return;
            }
        }
        System.out.println("Articolo non inserito: carrello pieno!");
    }

    public boolean isVuoto() {
        return articoli[0] == null;
    }

    public int calcolaPrezzo() {
        int prezzoCarrello = 0;
        for (Articolo articolo : articoli) {
            prezzoCarrello += articolo.getPrezzo();
        }
        return prezzoCarrello;
    }
    
    public String toString() {
        String descrizioneCarrello = "Il carrello contiene i seguenti articoli:\n";
        for (Articolo articolo : articoli) {
            descrizioneCarrello += articolo + "\n";
        }
        return descrizioneCarrello;
    }

}