public sealed class SealedSuperClass {
    public void method() {
        //final class LocalSubClass extends SealedSuperClass {}
    }
}

final class SubClass1 extends SealedSuperClass {}

final class SubClass2 extends SealedSuperClass {}