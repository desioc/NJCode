public class TestTryWithResource2 {
    public static void main(String args[]) {
        var risorsaChiudibile = new RisorsaChiudibile();
        try (risorsaChiudibile) {
            System.out.println("Sto per chiudere: "+ risorsaChiudibile);
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}