public class JavaIDE implements IDE {
    @Override
    public void modifica(FileSorgente file, String testo) {
        IDE.super.modifica(file, testo);
        file.aggiungiTesto(testo);
        System.out.println("Contenuto modificato:\n"+ file.getContenuto());
    }
}