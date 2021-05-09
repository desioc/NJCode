public class VarAnonymousTest {
    public static void main(String args[]) {
        var testObject = new Object() {
            String name ="This can be used with var!";
            void test(String test){
                System.out.println(test);
            }
        } ;
        testObject.test(testObject.name);
    }
}