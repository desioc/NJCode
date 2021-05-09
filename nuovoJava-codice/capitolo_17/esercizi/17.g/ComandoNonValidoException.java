package rubrica.eccezioni;

import java.io.IOException;

public class ComandoNonValidoException extends IOException {
    
    private static final long serialVersionUID = 6742493040156525789L;
    
    public ComandoNonValidoException(String comando){
        super("Comando non valido:" + comando);
    }
}