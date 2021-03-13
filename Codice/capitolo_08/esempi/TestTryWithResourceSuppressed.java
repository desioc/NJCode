public class TestTryWithResourceSuppressed {
    public static void main(String args[]) {
        try (var risorsaQuasiChiudibile = new RisorsaQuasiChiudibile()) {
            System.out.println("Sto per chiudere: "+ risorsaQuasiChiudibile);
            risorsaQuasiChiudibile.lanciaEccezione();
        }
        catch (Exception exc) {
            exc.printStackTrace();
            Throwable[] suppressedExceptions = exc.getSuppressed();
            for (Throwable exception : suppressedExceptions) {
                System.err.println("ECCEZIONE SOPPRESSA: "+ exception.toString());
            }
        }
    }
}