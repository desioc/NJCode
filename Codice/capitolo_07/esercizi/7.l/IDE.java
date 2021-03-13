public interface IDE extends Editor {
    default void compila(FileSorgente file) {
        System.out.println("File: "+ file.getNome() +" compilato!");
    }

    default void esegui(FileSorgente file) {
        System.out.println("File: "+ file.getNome() +" eseguito!");
    }
}