public class Rubrica {
    private static Rubrica instance;
    public Contatto[] contatti;
    public Speciale[] contattiSpeciali;

    private Rubrica () {
        contatti = new Contatto[] {
            new Contatto("Claudio De Sio Cesari","Via Java 13","131313131313"),
            new Contatto("Stevie Wonder","Via Musica 10","1010101010"),
            new Contatto("Gennaro Capuozzo","Piazza Quattro Giornate 1","1111111111")
        } ;

        contattiSpeciali = new Speciale[] {
            new Speciale("Mario Ruoppolo","Via Neruda 3","333333","Il Postino"),
            new Speciale("Vincenzo Malinconico","Via dei Tribunali 8","888888","Tuca Tuca"),
            new Speciale("Logan Howlett","Piazza Canada 6","66666","Hurt")
        } ;
    }

    public static Rubrica getInstance() {
        if (instance == null) {
            instance = new Rubrica();
        }
        return instance;
    }

    public Contatto[] cercaContattiPerNome(String nome) {
        Contatto []contattiTrovati = new Contatto[contatti.length];
        for (int i = 0, j = 0;  i < contattiTrovati.length; i++) {
            if (contatti[i].getNome().toUpperCase().contains(nome.toUpperCase())) {
                contattiTrovati[j] = contatti[i];
                j++;
            }
        }
        return contattiTrovati;
    }

    public Speciale[] cercaContattiSpecialiPerNome(String nome) {
        Speciale []contattiSpecialiTrovati = new Speciale[contattiSpeciali.length];
        for (int i = 0, j = 0;  i < contattiSpecialiTrovati.length; i++) {
            if (contattiSpeciali[i].getNome().toUpperCase().contains(nome.toUpperCase())) {
                contattiSpecialiTrovati[j] = contattiSpeciali[i];
                j++;
            }
        }
        return contattiSpecialiTrovati;
    }

    public Contatto[] getContatti() {
        return contatti;
    }
    
    public Speciale[] getContattiSpeciali() {
        return contattiSpeciali;
    }
}