interface Interface {}

sealed class Class permits SubClass {}

/* final */ non-sealed class SubClass extends Class {}

class SubClassInterface extends SubClass implements Interface {}

public class TestSealedHierarchy {
    public static void method(Class c) {
        if (c instanceof Interface) {
            System.out.println("c instanceof Interface -> true");
        }
    }
    
     public static void main(String args[]) {
        method(new SubClassInterface());
    }
}

