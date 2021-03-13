import java.util.concurrent.*;

public class Esercizio12T {

    public static void main(String args[]) {
        Callable<String> callable = new Callable<>() {public void call(){}};
        Future<String> future = Executors.newFixedThreadPool(3).start(callable);
        String result = future.get(); 
        /* Callable<String> callable = new Callable<>() { public String call(){return "";}};
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<String> future = service.submit(callable);
        String result = null;
        try {
            result = future.get();
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        service.shutdownNow(); */
        
    }
}