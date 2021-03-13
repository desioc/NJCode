public class RuntimeTest {
    public static void main(String args[]) {
        Runtime r = Runtime.getRuntime();
        try {
            r.exec("calc");
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }
}