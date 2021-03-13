import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class VideotecaConPredicate {
    private Film[] films;

    public VideotecaConPredicate () {
        films = new Film[10];
        caricaFilms();
    }
    
    public List<Film> getFilmFiltrati(Predicate<Film> filtroFilm) {
        List<Film> filmFiltrati = new ArrayList<Film>();
        for (Film film : films) {
            if (filtroFilm.test(film)) {
                filmFiltrati.add(film);
            }
        }
        return filmFiltrati;
    }

    private void caricaFilms() {
        films[0] = new Film("Il Signore degli anelli","Fantasy",5);
        films[1] = new Film("Star Wars","Fantascienza",5);
        films[2] = new Film("Avatar","Fantascienza",3);
        films[3] = new Film("Blade Runner","Fantascienza",4);
        films[4] = new Film("XMen","Fantascienza",5);
        films[5] = new Film("The Avengers","Fantasy",4);
        films[6] = new Film("Matrix","Fantascienza",5);
        films[7] = new Film("Lanterna Verde","Fantasy",3);
        films[8] = new Film("Forrest Gump","Drammatico",5);
        films[9] = new Film("Indiana Jones","Avventura",3);
    }
}