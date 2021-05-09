public interface F extends E {
    @Override
    default void m() {
        System.out.println("Nell'interfaccia B");
    }
}
