public class OrdinamentoFilm {
    public int ordinaPerNome(Film film1, Film film2) {
        return film1.getNome().compareTo(film2.getNome());
    }

    public int ordinaPerMediaRecensioni(Film film1, Film film2) {
        Integer mediaRecensioniFilm1 = new Integer(film1.getMediaRecensioni());
        Integer mediaRecensioniFilm2 = new Integer(film2.getMediaRecensioni());
        return mediaRecensioniFilm2.compareTo(mediaRecensioniFilm1);
    }
}