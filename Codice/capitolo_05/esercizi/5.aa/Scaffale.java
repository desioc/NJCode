public class Scaffale {
    private Libro[] libri;
    private String genere;
    
    public Scaffale(String genere) {
        libri = new Libro[100];
        setGenere(genere);
    }
    
    public void aggiungiLibro(Libro libro) {
        if (genere == null) {
            System.out.println("Il genere di questo scaffale non è stato "
                    + "ancora settato e quindi non possono essere aggiunti libri!");
            GenereUtils.stampaErrore(null);
            return;
        }
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] == null) {
                libri[i] = libro;
                return;
            }
        }        
        System.out.println("Scaffale pieno!");
    }

    public Libro[] getLibri() {
        return libri;
    }
    
    public void setGenere(String genere) {
        if (GenereUtils.isGenereValido(genere)) {
            this.genere = genere;
        } else {
            GenereUtils.stampaErrore(genere);
        }
    }

    public String getGenere() {
        return genere;
    }
}    