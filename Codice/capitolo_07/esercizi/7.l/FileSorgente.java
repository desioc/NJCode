public class FileSorgente extends File {
    private String contenuto;

    public FileSorgente(String nome, int tipo) {
        super(nome, tipo);
    }

    public FileSorgente(String nome, int tipo, String contenuto) {
        this(nome, tipo);
        this.contenuto = contenuto;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public void aggiungiTesto(String testo) {
        if (contenuto == null) {
            contenuto ="";
        }
        if (testo != null) {
            contenuto += testo;
        }
    }
    public void aggiungiTesto(String testo, int posizione) {
        final int length = contenuto.length();
        if (contenuto != null && testo != null && posizione > 0 &&
        posizione < length) {
            contenuto = contenuto.substring(0, posizione) + testo +
            contenuto.substring(posizione);
        }
    }
}