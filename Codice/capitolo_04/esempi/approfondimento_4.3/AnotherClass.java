package otherpackage;
import multiclass.NonPublicClass1;
import multiclass.NonPublicClass1;

class AnotherClass {
    
}

public class PublicClass {
    public static void main(String args[]) {
        NonPublicClass1 nonPublicClass1 = new NonPublicClass1();
        NonPublicClass2 nonPublicClass2 = new NonPublicClass2();
        nonPublicClass1.printName();
        nonPublicClass2.describeClass();
    }
}
