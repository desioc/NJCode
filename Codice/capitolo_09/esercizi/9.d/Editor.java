public interface Editor {
    default void salva(FileSorgente file) {
        System.out.println("File: " + file.getNome() + " salvato!");
    }
    default void apri(FileSorgente file) {
        System.out.println("File: " + file.getNome() + " aperto!");
    }
    default void chiudi(FileSorgente file) {
        System.out.println("File: " + file.getNome() + " chiuso!");
    }
    default void modifica(FileSorgente file, String testo) {
        System.out.println("File: " + file.getNome() + " modificato!");
    }
}