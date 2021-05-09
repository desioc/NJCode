public class TestVolanteAnonymous {
    public static void main(String args[]) {
        Volante ufo = new Volante() {
            @Override
            public void decolla() {
                System.out.println("Un oggetto non identificato sta decollando");
            }
            @Override
            public void plana() {
                System.out.println("Un oggetto non identificato sta planando");
            }
            @Override
            public void atterra() {
                System.out.println("Un oggetto non identificato sta atterrando");
            }
        } ;
        //Usiamo l’oggetto della classe anonima.
        ufo.decolla();
        ufo.plana();
        ufo.atterra();
    }
}