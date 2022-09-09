public class TestValueBasedClass {
    private Integer integer = 2;
    
    public void synchIncrement() {
        synchronized(integer) {
            System.out.println(++integer);
        }
    }
    
    public static void main(String args[]) {
        var tvbc = new TestValueBasedClass();
        tvbc.synchIncrement();
    }
}