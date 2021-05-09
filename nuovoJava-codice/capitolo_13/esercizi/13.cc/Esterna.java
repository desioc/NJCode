public class Esterna {
    private final static String stringa = "Classe Innestata";
    
    protected  Esterna () {
        private static class Innestata {
            protected void metodo () {
                System.out.println(stringa);
            }
        }
    }
}