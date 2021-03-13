public class Esercizio10Z {
    public static <E extends Exception> void printException(E e) {
        System.out.println(e.getMessage());
    } 
    public static void main(String[] args) {
        /*INSERISCI CODICE QUI*/Esercizio11Z.printException(new Throwable("Exception"));
    }
}