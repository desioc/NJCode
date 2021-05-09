package libreria.util;

public class GenereUtils {

    public static boolean isGenereValido(String genere, String[] generiValidi) {
        boolean genereValido = false;
        for (String generePredefinito : generiValidi) {
            if (generePredefinito.equals(genere)) {
                genereValido = true;
            }
        }
        return genereValido;
    }

    public static void stampaErrore(String genere, String[] generiValidi) {
        System.out.println("Genere " + genere + " non valido! Usare uno dei seguenti generi:");
        for (String generePredefinito : generiValidi) {
            System.out.println(generePredefinito);
        }
    }
}