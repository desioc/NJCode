package libreria.util;

public class GenereLetterarioUtils extends GenereUtils {
    public static final String ROMANZO = "Romanzo";
    public static final String SAGGIO = "Saggio";
    public static final String THRILLER = "Thriller";
    public static final String MANUALE = "Manuale";
    public static final String FANTASCIENZA = "Fantascienza";
    public static final String[] generi = { ROMANZO, SAGGIO, THRILLER, MANUALE, FANTASCIENZA };

    public static boolean isGenereValido(String genere) {
        return isGenereValido(genere, generi);
    }

    public static void stampaErrore(String genere) {
        stampaErrore(genere, generi);
    }
}