public class TestSemaforo2 {
    public static void main(String args[]) {
        Semaforo2 semaforo = new Semaforo2();
        semaforo.cambiaColore(Colore2.ROSSO);
        semaforo.stampaStato();
        semaforo.cambiaColore(Colore2.GIALLO);
        semaforo.stampaStato();
        semaforo.cambiaColore(Colore2.VERDE);
        semaforo.stampaStato();
        semaforo.cambiaColore(Colore2.NERO);
        semaforo.stampaStato();
    }
}