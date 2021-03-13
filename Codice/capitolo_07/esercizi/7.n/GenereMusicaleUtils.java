package libreria.util;

public class GenereMusicaleUtils extends GenereUtils {
    public static final String ROCK = "Rock";
    public static final String JAZZ = "Jazz";
    public static final String BLUES = "Blues";
    public static final String POP = "Pop";
    public static final String RAP = "Rap";
    public static final String[] generi = { ROCK, JAZZ, BLUES, POP, RAP };
    
    public static boolean isGenereValido(String genere) {
        return isGenereValido(genere, generi);
    }
    
    public static void stampaErrore(String genere) {
        stampaErrore(genere, generi);
    }
}