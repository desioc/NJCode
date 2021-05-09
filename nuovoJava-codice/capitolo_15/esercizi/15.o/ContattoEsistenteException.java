package rubrica.eccezioni;
import java.io.IOException;

public class ContattoEsistenteException extends IOException {
    
    private static final long serialVersionUID = 8942402240056525662L;
    
    public ContattoEsistenteException (String message){
        super(message);
    }
}