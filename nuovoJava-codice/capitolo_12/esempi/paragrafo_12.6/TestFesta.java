import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class TestFesta {
    public static void main(String args[]) {
        CyclicBarrier luogoDellaFesta = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("Tutti presenti, possiamo iniziare!");
            }
        } );
        Festa festa = new Festa(luogoDellaFesta);
        new Thread(festa,"Antonio").start();
        new Thread(festa,"Marcello").start();
        new Thread(festa,"Serena").start();
    }
}