import java.util.List;
import java.util.ArrayList;

public class Videoteca {
    private List<Film> films;

    public Videoteca () {
        films = new ArrayList<Film>();
        caricaFilms();
    }
    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Film> getFilms() {
        return films;
    }

    public List<Film> getFilmDiFantascienza() {
        List<Film> filmDiFantascienza = new ArrayList<Film>();
        for (Film film : films) {
            if ("Fantascienza".equals(film.getGenere())) {
                filmDiFantascienza.add(film);
            }
        }
        return filmDiFantascienza;
    }

    public List<Film> getBeiFilm() {
        List<Film> beiFilms = new ArrayList<Film>();
        for (Film film : films) {
            if (film.getMediaRecensioni() > 3) {
                beiFilms.add(film);
            }
        }
        return beiFilms;
    }

    public List<Film> getFilmFiltrati(FiltroFilm filtroFilm) {
        List<Film> filmFiltrati = new ArrayList<Film>();
        for (Film film : films) {
            if (filtroFilm.filtra(film)) {
                filmFiltrati.add(film);
            }
        }
        return filmFiltrati;
    }

    private void caricaFilms() {
        films.add(new Film("Il Signore degli anelli","Fantasy",5));
        films.add(new Film("Star Wars","Fantascienza",5));
        films.add(new Film("Avatar","Fantascienza",3));
        films.add(new Film("Blade Runner","Fantascienza",4));
        films.add(new Film("XMen","Fantascienza",5));
        films.add(new Film("The Avengers","Fantasy",4));
        films.add(new Film("Matrix","Fantascienza",5));
        films.add(new Film("Lanterna Verde","Fantasy",3));
        films.add(new Film("Forrest Gump","Drammatico",5));
        films.add(new Film("Indiana Jones","Avventura",3));
    }
}