public class TestPilota {
    public static void main(String args[]) {
        Pilota pilota = new Pilota("Simone");
        pilota.fattiUnGiro(new Volante() {
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
                System.out.println("Un oggetto non identificato atterra…");
            }
        } );
    }
}