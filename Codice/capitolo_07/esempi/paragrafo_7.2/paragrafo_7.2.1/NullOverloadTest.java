public class NullOverloadTest {
    public void overloadedMethod(String string) {
        System.out.println("overloadedMethod(String string)");
    }

    public void overloadedMethod(Integer integer) {
        System.out.println("overloadedMethod(Integer integer)");
    }
/* Soluzione
    public void overloadedMethod(Object object) {
        System.out.println("overloadedMethod(Object object)");
    }

    public void overloadedMethod(String string) {
        System.out.println("overloadedMethod(String string)");
    } */
    
    public static void main(String args[]) {
        var nullOverloadTest = new NullOverloadTest();
        nullOverloadTest.overloadedMethod(null);
    }
}
