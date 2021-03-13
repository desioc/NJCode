public interface Lettore {
    default void leggi(Libro libro) {
        System.out.println("Sto leggendo: " + libro.getTitolo() + " di " + libro.getAutore());
    }
}