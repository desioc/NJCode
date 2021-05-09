public class TestSemaforo {
    public static void main(String args[]) {
        Semaforo semaforo = new Semaforo();
        semaforo.cambiaColore(Colore.ROSSO);
        semaforo.cambiaColore(Colore.GIALLO);
        semaforo.cambiaColore(Colore.VERDE);
    }
}