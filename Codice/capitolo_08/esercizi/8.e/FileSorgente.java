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
        if (contenuto != null && testo != null) {
            contenuto += testo;
        }
    }
    public void aggiungiTesto(String testo, int posizione) {
        try {
            if (testo != null) {
                contenuto = contenuto.substring(0, posizione) + testo +
                        contenuto.substring(posizione);
            }
        } catch (NullPointerException exc) {
            System.out.println("Il contenuto è null : " + exc.getMessage());
            contenuto = "" + testo;
        } catch (StringIndexOutOfBoundsException exc) {
            System.out.println("L'indice " + posizione + " è invalido : " +
                    exc.getMessage());
            contenuto = (posizione < 0 ? testo + contenuto : contenuto + testo);
        }
    }  
}