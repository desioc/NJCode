public class Esercizio2Z {
    public static void main(String args[]) {
        Citta citta = new Citta("Roma");
        Nazione nazione = new Nazione("Italia", citta, 60000000);
        System.out.println("L'" + nazione.nome + " ha come capitale " + citta.nome);
    }
}