public class Esercizio8Z {
    private static final String PREFISSO_FRASE ="Il risultato è ";
    public static void main(String args[]) {
        SommaIntero sommaIntero = new SommaIntero();
        System.out.println(PREFISSO_FRASE + sommaIntero.somma(1.0, 1.0));
        System.out.println(PREFISSO_FRASE + sommaIntero.somma(1, null));
        System.out.println(PREFISSO_FRASE + sommaIntero.somma(1, 25));
    }
}