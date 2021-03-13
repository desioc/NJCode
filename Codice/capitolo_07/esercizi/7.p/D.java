interface A {
    void metodo();
}

interface B extends A {
    static void metodoStatico(){}
}

final class C implements B {}

public abstract class D implements A {
    @Override
    void metodo(){}
}