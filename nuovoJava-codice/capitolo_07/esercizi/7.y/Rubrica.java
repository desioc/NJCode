package rubrica.dati;

public class Rubrica implements Dato {
    private static Rubrica instance;

    public Contatto[] contatti;

    private Rubrica () {
        contatti = new Contatto[] {
            new Contatto("Claudio De Sio Cesari","Via Java 13","131313131313"),
            new Contatto("Stevie Wonder","Via Musica 10","1010101010"),
            new Contatto("Gennaro Capuozzo","Piazza Quattro Giornate 1","1111111111"),
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

    public Contatto[] getContatti() {
        return contatti;
    }

    public Speciale[] getContattiSpeciali() {
        Speciale[] contattiSpecialiTrovati = new Speciale[contatti.length];
        for (int i = 0, j = 0; i < contatti.length; ++i) {
            if (contatti[i] == null) {
                break;
            }
            if (contatti[i] instanceof Speciale) {
                contattiSpecialiTrovati[j] = (Speciale)contatti[i];
                j++;
            }
        }
        return contattiSpecialiTrovati;
    }
    public Contatto[] getContattiOrdinari() {
        Contatto[] contattiOrdinariTrovati = new Contatto[contatti.length];
        for (int i = 0, j = 0; i < contatti.length; ++i) {
            if (contatti[i] == null) {
                break;
            }
            if (!(contatti[i] instanceof Speciale)) {
                contattiOrdinariTrovati[j] = contatti[i];
                j++;
            }
        }
        return contattiOrdinariTrovati;
    }
}