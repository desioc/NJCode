package rubrica.eccezioni;

public class NomeVuotoException extends Exception {
    private static final long serialVersionUID = 8290498479156525745L;

    public NomeVuotoException() {
        super("Il nome del contatto non può essere vuoto!");
    }
}