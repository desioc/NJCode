//è possibile dichiarare più tipi nello stesso file, 
//a patto che uno solo sia dichiarato pubblico (e il 
//file deve avere il nome del tipo pubblico)

interface A {
    void metodo();
}

interface B extends A {}

abstract class C implements B {}

public final class D extends C {
    public void metodo(){}
}