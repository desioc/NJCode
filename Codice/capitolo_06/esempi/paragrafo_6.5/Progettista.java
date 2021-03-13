public interface Progettista {
    default void progetta(String strumento) {
        System.out.println("Sto progettando software con " + strumento);
    }
}