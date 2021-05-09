import java.util.concurrent.Semaphore;

public class Incrocio {
    Semaphore semaforo = new Semaphore(1);

    public void rispettaSemaforo() {
        try {
            semaforo.acquire();
            System.out.println(Thread.currentThread().getName() +" sta superando l'incrocio");
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } finally {
            semaforo.release();
            System.out.println(Thread.currentThread().getName() +" ha superato l'incrocio");
        }
    }

    public static void main(String args[]) {
        Incrocio incrocio = new Incrocio();
        Thread t1 = new Thread(new Veicolo(incrocio),"Una Ford");
        t1.start();
        Thread t2 = new Thread(new Veicolo(incrocio),"Una Nissan");
        t2.start();
    }
}