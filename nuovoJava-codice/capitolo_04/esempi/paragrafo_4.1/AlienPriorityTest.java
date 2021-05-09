public class AlienPriorityTest {
    public static void main(String args[]) {
        int a = 2;
        int b = 10;
        a *= a + b; //  a = a * (a + b) => a = a * (12; => a = 2 * 12 => a = 24
        System.out.println(a);
    }
}