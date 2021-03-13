public class TestStampante {
    public static void main(String args[]) {
        Stampante<Laser> stampante = new Stampante<>(new Laser());
        stampante.stampa();
        Stampante<Inkjet> stampante2 = new Stampante<>(new Inkjet());
        stampante2.stampa();
    }
}