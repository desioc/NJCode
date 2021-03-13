public interface TestMetodiPrivatiInInterfaccia {
    default void metodoDiDefault() {
        metodoPrivato();
    }
    
    private /*default*/ void metodoPrivato() {
        System.out.println("Invocato metodo privato");
    }
}