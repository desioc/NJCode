import java.util.List;
import java.util.ArrayList;

public class TestVideoteca {
    public static void main(String args[]) {
        Videoteca videoteca = new Videoteca();
        System.out.println("Bei Film:");
//        List<Film> beiFilms =   videoteca.getBeiFilm();
        List<Film> beiFilms =   videoteca.getFilmFiltrati(new FiltroFilm() {
            public boolean filtra(Film film) {
                return film.getMediaRecensioni() >3;
            }
        } );
        stampaFilm(beiFilms);

        System.out.println("\nFilm di Fantascienza:");
//        List<Film> filmDiFantascienza =   videoteca.getFilmDiFantascienza();
        List<Film> filmDiFantascienza =   videoteca.getFilmFiltrati(new FiltroFilm() {
            public boolean filtra(Film film) {
                return"Fantascienza".equals(film.getGenere());
            }
        } );
        stampaFilm(filmDiFantascienza);
    }

    private static void stampaFilm(List<Film> films) {
        for (Film film: films) {
            if (film != null) {
                System.out.println(film);
            }
        }
    }
}