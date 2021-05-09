public class TestGara {
    public static void main(String args[]) {
        Gara imola = new Gara("GP di Imola");
        imola.corriGara();
        String risultato = imola.getRisultato();
        System.out.println(risultato);
    }
}