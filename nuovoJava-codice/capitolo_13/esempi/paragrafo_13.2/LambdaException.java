import java.util.concurrent.*;

public class LambdaException {
    @FunctionalInterface
    interface MyCallable extends Callable<Void> {
        @Override
        Void call() throws InterruptedException;
    }
    public static void main(String args[]) {
        new Thread(()-> {
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException exc) {
                exc.printStackTrace();
            }
            System.out.println("Hello World");
        } ).start();

        MyCallable callable = ()-> {
            Thread.sleep(1000);
            System.out.println("Hello World");
            return null;
        } ;
        ExecutorService pool = Executors.newFixedThreadPool(1);
        pool.submit(callable);
        pool.shutdown();
    }
}