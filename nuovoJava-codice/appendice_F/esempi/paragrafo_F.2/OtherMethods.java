public class OtherMethods{
    public static void main(String args[]) {
        long tempoIniziale = System.currentTimeMillis();
        System.out.println("La variabile PATH vale: " + System.getenv("PATH"));
        System.out.println(System.getenv());
        System.out.println(System.lineSeparator());
        long tempoTotale = System.currentTimeMillis() - tempoIniziale;
        System.out.println("Tempo totale passato: " + tempoTotale + " millisecondi");
    }
}