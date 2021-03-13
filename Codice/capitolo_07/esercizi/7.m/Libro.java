package libreria.dati;
import libreria.util.*;

public class Libro extends Articolo {
    
    public Libro(String isbn, String titolo, String autore, int prezzo, String genere) {
        super(isbn, titolo, autore, prezzo, genere);
    }
    
    public void setGenere(String genere) {
        if (GenereLetterarioUtils.isGenereValido(genere)) {
            super.setGenere(genere);
        } else {
            GenereLetterarioUtils.stampaErrore(genere);
        }
    }
    
    @Override
    public String toString() {
        return  "Libro" + super.toString();
    }

}