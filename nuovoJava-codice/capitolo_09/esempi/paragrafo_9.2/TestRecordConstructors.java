public class TestRecordConstructors {
    public static void main(String args[]) {
        var foto1 = new Foto("Foto 1" , true); // costruttore canonico
        System.out.println(foto1);
        var foto2 = new Foto("Foto 2" , false, "Errore!"); // costruttore non canonico
        System.out.println(foto2);
        var foto3 = new Foto("Foto" , true, "Errore!"); // costruttore non canonico
        System.out.println(foto3);
    }
}