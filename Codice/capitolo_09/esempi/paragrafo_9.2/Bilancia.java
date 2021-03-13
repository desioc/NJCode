public class Bilancia {
    public static void main(String args[]) {
        var scarpe = new Articolo("Scarpe", 0.8);
        var cavoUSB = new Articolo("Cavo USB", 0.1);
        var imballaggioCavoUSB = new Imballaggio(Misura.SMALL, cavoUSB);
        var occhiali = new Articolo("Occhiali", 0.2);
        var imballaggioLarge = new Imballaggio(Misura.LARGE, scarpe, occhiali, imballaggioCavoUSB);
        pesa(imballaggioLarge);
    }

    public static void pesa(Pesabile pesabile) {
        System.out.println(pesabile + "Peso:");
        System.out.println(pesabile.getPeso());
    }
}