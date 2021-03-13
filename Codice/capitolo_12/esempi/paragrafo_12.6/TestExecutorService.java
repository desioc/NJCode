import java.util.concurrent.*;

public class TestExecutorService {
    public static void main(String args[]) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i =0; i<100; i++) {
            Future<Integer> future = service.submit(new Processo(i));
            System.out.println(" Valore : "+future.get());
        }
        service.shutdownNow();
    }
}

class Processo implements Callable<Integer> {
    private int id;

    public Processo(int id) {
        this.id = id;
    }

    @Override
    public synchronized Integer call() {
        System.out.print("ID : "+ this.id +", thread :  "+  Thread.currentThread().getName());
        return this.id;
    }
}