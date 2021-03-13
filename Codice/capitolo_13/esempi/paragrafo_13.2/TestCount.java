public class TestCount {
    private int count;
    public TestCount (int count){
        this.count = count;
    } 
    public void startCount() {
//        int count = 0;
        new Thread(() -> {
            while (count  < 100) {
               System.out.println(count);
            }
        });
    }
}