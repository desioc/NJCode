public class InitTest {
    {
        System.out.println("Initializer");
    }
    static {
        System.out.println("Static Initializer");
    }
    public InitTest () {
        System.out.println("Constructor");
    }
    public void method() {
        System.out.println("Method");
    }
    public static void staticMethod() {
        System.out.println("Static Method");
        new InitTest().method();
    }
    public static void main(String args[]) {
        InitTest.staticMethod();
    }
}