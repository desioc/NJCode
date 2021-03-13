public class Esercizio4T {

    public static void main(String args[]) {
        CalcolatriceSemplificata calcolatriceSemplificata = new CalcolatriceSemplificata();
        System.out.println("42.7 + 47.8 = " + calcolatriceSemplificata.somma(42.7, 47.8));
        System.out.println("42.7 - 47.8 = " + calcolatriceSemplificata.sottrai(42.7, 47.8));
        System.out.println("42.7 x 47.8 = " + calcolatriceSemplificata.moltiplica(42.7, 47.8));
        System.out.println("42.7 : 47.8 = " + calcolatriceSemplificata.dividi(42.7, 47.8));
        System.out.println("il resto della divisione tra 42.7 e 47.8 è " + calcolatriceSemplificata.restituisciResto(42.7, 47.8));
        System.out.println("Il massimo tra 42.7 e 47.8 è " + calcolatriceSemplificata.massimo(42.7, 47.8));
        System.out.println("Il minimo tra 42.7 e 47.8 è " + calcolatriceSemplificata.minimo(42.7, 47.8));
    }

}