public class TestEreditarietaMultipla {
    public static void main(String args[]) {
        var tu = new ChiStaLeggendo();
        var nuovoJava = new Libro("Il nuovo Java","Claudio De Sio Cesari");
        tu.programma("Java");
        tu.leggi(nuovoJava);
    }
}