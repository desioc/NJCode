public class SwitchTest {
    public static void main(String args[]) {
        byte b = 1;
        var i =b;
        switchTest(b);
    }
    public static void switchTest(byte test) {
        switch (test) {
            case 1:
                System.out.println("case 1");
            break;
            default:
                System.out.println("default");
            break;
        }
    }
}