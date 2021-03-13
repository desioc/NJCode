public class Filtri {
    public static boolean isBelFilm(Film film) {
        return  film.getMediaRecensioni() > 3;
    }

    public static boolean isFilmDiFantascienza(Film film) {
        return"Fantascienza".equals(film.getGenere());
    }
}