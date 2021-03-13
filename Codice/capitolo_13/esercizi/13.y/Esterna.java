public class Esterna {
    private int intero = 5;

    public static void main(String[] args) {
        Esterna.Interna interna = new Esterna().new Interna();
        interna.metodoInterno();
    }
    private class Interna extends Esterna {
        private int intero = 10;
        protected void metodoInterno() {
            System.out.println(super.intero);
            System.out.println(this.intero);
        }
    }
}