//@SuppressWarnings("serial")
public class PrenotazioneException extends Exception {
    public PrenotazioneException() {
        // Il costruttore di Exception chiamato inizializza la
        // variabile privata message
        super("Problema con la prenotazione");
    }
    @Override
    public String toString() {
        return getMessage() + ": posti esauriti!";
    }
}