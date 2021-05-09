package rubrica.eccezioni;
import java.io.IOException;

public class ContattoInesistenteException extends IOException {
    
    private static final long serialVersionUID = 8942402240056525663L;
    
    public ContattoInesistenteException (String message){
        super(message);
    }
}