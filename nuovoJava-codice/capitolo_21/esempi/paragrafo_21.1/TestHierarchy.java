interface Interface {}

/* final */ class Class {}

class ClassInterface extends Class implements Interface {}

public class TestHierarchy {
    public static void method(Class c) {
        if (c instanceof Interface) {
            System.out.println("c instanceof Interface -> true");
        }
    }
    
    public static void main(String args[]) {
        method(new ClassInterface());
    }
}