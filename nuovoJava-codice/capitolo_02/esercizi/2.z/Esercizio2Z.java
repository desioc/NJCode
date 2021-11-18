public class Esercizio2Z {
    public static void main(String args[]) {
         Citta capitale = new Citta("Roma");
        Nazione italia = new Nazione("Italia", capitale, 60_000_000);
        System.out.println("L'" + italia.nome + " ha come capitale " + italia.capitale.nome);
    }
}