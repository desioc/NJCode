public class TestLock {
    public static void main(String args[]) {
        LockExample lockExample = new LockExample(0);
        Thread t1 = new Thread(lockExample, "1");
        Thread t2 = new Thread(lockExample, "2");
        t1.start();
        t2.start();
    }
}