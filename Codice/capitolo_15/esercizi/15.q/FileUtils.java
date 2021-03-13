package rubrica.util;

public class FileUtils {
    
    public static final String SUFFIX =".con";

    public static String getNomeFile(String nome) {
        return nome + SUFFIX;
    }
}