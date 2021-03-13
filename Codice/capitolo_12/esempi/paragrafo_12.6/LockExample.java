import java.util.concurrent.locks.*;
import java.util.concurrent.*;

public class LockExample implements Runnable {
    private int numeroIntero;
    private Lock lock;

    public LockExample(int numeroIntero) {
        this.numeroIntero = numeroIntero;
        this.lock = new ReentrantLock();
    }

    @Override
    public void run() {
        try {
            if(lock.tryLock(5, TimeUnit.SECONDS)) {
                numeroIntero++;
                System.out.println("In lock "+numeroIntero);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        System.out.println("Out lock "+numeroIntero);
    }
}