import java.util.*;

public class TestVideotecaConLambda {
    public static void main(String args[]) {
        Videoteca videoteca = new Videoteca();
        System.out.println("Bei Film:");
//        List<Film> beiFilms =   videoteca.getBeiFilm();
       /* List<Film> beiFilms =   videoteca.getFilmFiltrati(new FiltroFilm() {
           @Override
            public boolean filtra(Film film) {
                return film.getMediaRecensioni() >3;
            }
        }); */
        List<Film> beiFilms = videoteca.getFilmFiltrati((Film film)-> film.getMediaRecensioni() >3);
        stampaFilm(beiFilms);
        System.out.println("\nFilm di Fantascienza:");
//        List<Film> filmDiFantascienza =   videoteca.getFilmDiFantascienza();
       /* List<Film> filmDiFantascienza =   videoteca.getFilmFiltrati(new FiltroFilm() {
           @Override
            public boolean filtra(Film film) {
                return"Fantascienza".equals(film.getGenere());
            }
        }); */
        List<Film> filmDiFantascienza = videoteca.getFilmFiltrati((Film film)->"Fantascienza".equals(film.getGenere()));
        stampaFilm(filmDiFantascienza);

        System.out.println("\nFilm che finiscono con s:");
        List<Film> filmCheFinisconoConS  = videoteca.getFilmFiltrati((Film film)->film.getNome().endsWith("s"));
        stampaFilm(filmCheFinisconoConS);

        System.out.println("\nFilm di fantascienza filtrati con uno static method reference:");
        System.out.println("\nFilm di Fantascienza:");
        filmDiFantascienza = videoteca.getFilmFiltrati(Filtri::isFilmDiFantascienza);
        stampaFilm(filmDiFantascienza);
        //Reference a metodi         
        System.out.println("\nBei Film filtrati con una lambda che usa il metodo di Filtri:");
        System.out.println("\nFilm di Fantascienza:");
        filmDiFantascienza = videoteca.getFilmFiltrati((Film film)->Filtri.isBelFilm(film));
        stampaFilm(filmDiFantascienza);

        List<Film> films = videoteca.getFilms();
        System.out.println("\nFilm ordinati per nome con un instance method reference :");
        OrdinamentoFilm ordinamentoFilm = new OrdinamentoFilm();
        /* Collections.sort(films, (Film film1, Film film2)-> film1.getNome().compareTo(film2.getNome())); */
        Collections.sort(films, ordinamentoFilm::ordinaPerNome); 
        stampaFilm(films);

        System.out.println("\nFilm ordinati per media recensioni con un instance method reference :");
        Collections.sort(films, ordinamentoFilm::ordinaPerMediaRecensioni);
        stampaFilm(films);        

        System.out.println("\nNomi di Film (stringhe) ordinati per nome minuscolo con un instance method of an arbitrary object of a type reference :");
        List<String> filmNames = new ArrayList<String>();
        for(Film film:films) {
            filmNames.add(film.getNome());
        }
//        Collections.sort(filmNames, (s1,s2)->s1.compareToIgnoreCase(s2));
        Collections.sort(filmNames, String::compareToIgnoreCase);
        stampaFilm(films); 
        
        String s1 = "Rosalia";
        String s2 = "rosalia";
        System.out.println("\nRosalia vs rosalia = "+ s1.compareToIgnoreCase(s2));
    }

    private static void stampaFilm(List<Film> films) {
        for (Film film: films) {
            if (film != null) {
                System.out.println(film);
            }
        }
    }
}