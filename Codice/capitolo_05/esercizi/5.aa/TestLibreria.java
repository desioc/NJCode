public class TestLibreria {
    public static void main(String[] args) {
        Libro jfaVol1 = new Libro("979-12-200-4915-3", "Java for Aliens Vol. 1", "Claudio De Sio Cesari", 25, GenereUtils.MANUALE);
        Libro jfaVol2 = new Libro("979-12-200-4916-0", "Java for Aliens Vol. 2", "Claudio De Sio Cesari", 25, GenereUtils.MANUALE);
        Libro f451 = new Libro("978-88-046-6529-8", "Fahrenheit 451", "Ray Bradbury", 10, GenereUtils.FANTASCIENZA);
        Libro shining = new Libro("978-88-452-9530-0", "Shining", "Stephen King", 12, GenereUtils.THRILLER);
        Libro icda = new Libro("978-88-683-6730-5", "Il cacciatore di aquiloni", "Khaled Hosseini", 11, GenereUtils.ROMANZO);
        Libro ltdt = new Libro("978-88-170-7976-1", "La teoria del tutto", "Stephen Hawking", 10, GenereUtils.SAGGIO);
        Scaffale scaffaleManuali = new Scaffale(GenereUtils.MANUALE);
        Scaffale scaffaleFantascienza = new Scaffale(GenereUtils.FANTASCIENZA);
        Scaffale scaffaleFantascienza2 = new Scaffale(GenereUtils.FANTASCIENZA);
        Scaffale scaffaleThriller = new Scaffale(GenereUtils.THRILLER);
        Scaffale scaffaleRomanzi = new Scaffale(GenereUtils.ROMANZO);
        Scaffale scaffaleSaggi = new Scaffale(GenereUtils.SAGGIO);
        Scaffale scaffaleSaggi2 = new Scaffale(GenereUtils.SAGGIO);
        scaffaleManuali.aggiungiLibro(jfaVol1);
        scaffaleManuali.aggiungiLibro(jfaVol2);
        scaffaleFantascienza.aggiungiLibro(f451);
        scaffaleThriller.aggiungiLibro(shining);
        scaffaleRomanzi.aggiungiLibro(icda);
        scaffaleSaggi.aggiungiLibro(ltdt);
        Libreria libreria = Libreria.getInstance();
        libreria.setNome("Libreria per alieni");
        libreria.aggiungiScaffale(scaffaleManuali);
        libreria.aggiungiScaffale(scaffaleFantascienza);
        libreria.aggiungiScaffale(scaffaleFantascienza2);
        libreria.aggiungiScaffale(scaffaleThriller);
        libreria.aggiungiScaffale(scaffaleRomanzi);
        libreria.aggiungiScaffale(scaffaleSaggi);
        libreria.aggiungiScaffale(scaffaleSaggi2);
        Scaffale[] scaffali = libreria.getScaffali();
        System.out.println("Elenco scaffali della libreria:");
        for (Scaffale scaffale : scaffali) {
            System.out.println("Scaffale " + scaffale.getGenere() + ":");
            Libro[] libri = scaffale.getLibri();
            for (Libro libro : libri) {
                if (libro != null) {
                    System.out.println("\t" + libro.getTitolo() + " di " + libro.getAutore() + " (Genere " + libro.getGenere() + ")");
                }
            }
        }
    }
}