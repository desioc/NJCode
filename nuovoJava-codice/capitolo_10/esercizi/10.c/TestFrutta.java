public class TestFrutta {
    public static void main(String args[]) {
        Cesta<Mela> cestaDiMele = new Cesta<>();
        for (int i = 0; i <= 20; i++) {
            try {
                Mela mela = new Mela(100);
                cestaDiMele.aggiungiFrutta(mela);
            } catch (PesoException exc) {
                System.out.println(exc.getMessage());
            }
        }
    }
}