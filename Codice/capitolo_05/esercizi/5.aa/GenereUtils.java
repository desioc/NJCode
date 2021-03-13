public class GenereUtils {
    public static final String ROMANZO = "Romanzo";
    public static final String SAGGIO = "Saggio";
    public static final String THRILLER = "Thriller";
    public static final String MANUALE = "Manuale";
    public static final String FANTASCIENZA = "Fantascienza";
    public static final String[] generi = { ROMANZO, SAGGIO, THRILLER, MANUALE, FANTASCIENZA };

    public static boolean isGenereValido(String genere) {
        boolean genereValido = false;
        for (String generePredefinito : generi) {
            if (generePredefinito.equals(genere)) {
                genereValido = true;
                break;
            }
        }
        return genereValido;
    }

    public static void stampaErrore(String genere) {
        System.out.println("Genere + " + genere + " non valido! Usare uno dei seguenti generi:");
        for (String generePredefinito : generi) {
            System.out.println(generePredefinito);
        }
    }
}