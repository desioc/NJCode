package rubrica.util;

public class Contatore {
    private static int contatoreOggetti;
    
    public static int dammiNumeroSeriale() {
        return contatoreOggetti+=1;
    }
}