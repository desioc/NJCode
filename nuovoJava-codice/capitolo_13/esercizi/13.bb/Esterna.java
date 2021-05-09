public class Esterna {   
    private class Interna {
        private static int effectivelyFinalVariable = 10;
        Interna() {
            effectivelyFinalVariable = 11;
        }
        protected void metodo () {
            System.out.println(effectivelyFinalVariable);
        }
    }
}