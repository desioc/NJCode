public class Album extends Articolo {
    public Album(String ismn, String titolo, String artista, int prezzo, String genere) {
        super(ismn, titolo, artista, prezzo, genere);
    }

    public void setGenere(String genere) {
        if (GenereMusicaleUtils.isGenereValido(genere)) {
            super.setGenere(genere);
        } else {
            GenereMusicaleUtils.stampaErrore(genere);
        }
    }
}