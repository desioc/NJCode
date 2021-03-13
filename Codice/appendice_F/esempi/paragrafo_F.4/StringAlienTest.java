public class StringAlienTest {
    final String constant ="K";

    public void method() {
        String local ="K";
        System.out.println("KK"=="K"+constant);
        System.out.println("K"=="K"+local);
    }

    public static void main(String args[]) {
        var sat = new StringAlienTest();
        sat.method();
    }
}