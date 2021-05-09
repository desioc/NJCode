import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TestVideotecaConPredicate {
    public static void main(String args[]) {
        VideotecaConPredicate videoteca = new VideotecaConPredicate();
        System.out.println("Bei Film:");

        List<Film> beiFilms = videoteca.getFilmFiltrati((Film film)-> film.getMediaRecensioni() >3);
        stampaFilm(beiFilms);
        System.out.println("\nFilm di Fantascienza:");
        List<Film> filmDiFantascienza = videoteca.getFilmFiltrati((Film film)->"Fantascienza".equals(film.getGenere()));
        stampaFilm(filmDiFantascienza);
        System.out.println("\nBei film di Fantascienza:");
        Predicate<Film> predicateFilmFantascienza = (Film film)->"Fantascienza".equals(film.getGenere());
        Predicate<Film> predicateBeiFilm = (Film film)-> film.getMediaRecensioni() >3;
        List<Film> filmDiFantascienzaBelli = videoteca.getFilmFiltrati(predicateFilmFantascienza.and(predicateBeiFilm));
        stampaFilm(filmDiFantascienzaBelli);
    }
    private static void stampaFilm(List<Film> films) {
        for (Film film: films) {
            if (film != null) {
                System.out.println(film);
            }
        }
    }
}