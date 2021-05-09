package rubrica.eccezioni;

import java.io.IOException;

public class NomeVuotoException extends IOException {
    private static final long serialVersionUID = 8290498479156525745L;

    public NomeVuotoException() {
        super("Il nome del contatto non può essere vuoto!");
    }
}