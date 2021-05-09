public class Esercizio3S {
    public static void main(String args[]) {
        Nave nave = new Nave();
        Auto auto1 = new Auto("Renault");
        Auto auto2 = new Auto("Volkswagen");
        Auto auto3 = new Auto("Nissan");
        nave.caricaAuto(auto1);
        nave.caricaAuto(auto2);
        nave.caricaAuto(auto3);
    }
}