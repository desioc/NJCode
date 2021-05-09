import java.util.*;

public class TestSimpleOptional {
    public static String getTitoloMaiuscoloOpt(String titolo) {
        Optional<String> opt = Optional.ofNullable(titolo);
//        return opt.orElse("NESSUN TITOLO").toUpperCase();
//        return opt.orElseGet(() ->"NESSUN TITOLO").toUpperCase();
        return opt.orElseThrow(IllegalArgumentException::new);
    }

    public static boolean isTitoloJava(OggettoModificabile o) {
        return Optional.ofNullable(o)
            .map(OggettoModificabile::getTitolo)
            .filter(t -> t.contains("Java"))
            .isPresent();
    }

    public static Optional<String> getTitoloOpt(OggettoModificabile o) {
        return Optional.ofNullable(o.getTitolo());
    }

    public static boolean isTitoloJavaFM(OggettoModificabile o) {
        return Optional.ofNullable(o)
            .flatMap(TestSimpleOptional::getTitoloOpt)
            .filter(t -> t.contains("Java"))
            .isPresent();
    }

    public static String getTitoloMaiuscolo(String titolo) {
        if (titolo != null) {
            return  titolo.toUpperCase();
        }
        return "NESSUN TITOLO" ;
    }

    public static void main(String args[]) {
//        System.out.println(getTitoloMaiuscolo("titolo"));
//        System.out.println(getTitoloMaiuscolo(null));

//        System.out.println(getTitoloMaiuscoloOpt("titolo"));
//        System.out.println(getTitoloMaiuscoloOpt(null)); //lancia l'eccezione

//        OggettoModificabile o = new OggettoModificabile("Manuale di Java 9");
//        System.out.println(isTitoloJava(o));
//        o.setTitolo("SQL");
//        System.out.println(isTitoloJava(o));
//        o.setTitolo(null);
//        System.out.println(isTitoloJava(o));
//        o = null;
//        System.out.println(isTitoloJava(o));

        OggettoModificabile o = new OggettoModificabile("Manuale di Java 9");
        System.out.println(isTitoloJavaFM(o));
        o.setTitolo("SQL");
        System.out.println(isTitoloJavaFM(o));
        o.setTitolo(null);
        System.out.println(isTitoloJavaFM(o));
        o = null;
        System.out.println(isTitoloJavaFM(o));
    }
}