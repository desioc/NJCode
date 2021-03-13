import java.util.concurrent.*;

@FunctionalInterface
interface MyCallable extends Callable<Void> {
    @Override
    Void call() throws InterruptedException;
}
