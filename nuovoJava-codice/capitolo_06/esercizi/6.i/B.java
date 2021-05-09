public interface B extends A {
    @Override
    default void m() {
        System.out.println("B.m()");
    }
}