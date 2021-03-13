public class TestTryWithResource {
    public static void main(String args[]) {
        try (var risorsaChiudibile = new RisorsaChiudibile()) {
            System.out.println("Sto per chiudere: "+ risorsaChiudibile);
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}