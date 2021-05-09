public interface Programmatore {
    default void programma(String linguaggio) {
        System.out.println("Sto programmando in " + linguaggio);
    }
}