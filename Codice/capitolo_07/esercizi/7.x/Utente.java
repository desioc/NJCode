package rubrica.business;
import rubrica.dati.*;

public class Utente {
    public Contatto[] cercaContattiPerNome(String nome) {
        Contatto []contatti = Rubrica.getInstance().getContatti();
        Contatto []contattiTrovati = new Contatto[contatti.length];
        for (int i = 0, j = 0;  i < contattiTrovati.length; i++) {
            if (contatti[i] == null) {
                break;
            }
            if (contatti[i].getNome().toUpperCase().contains(nome.toUpperCase())) {
                contattiTrovati[j] = contatti[i];
                j++;
            }
        }
        return contattiTrovati;
    }
    
    public Speciale[] cercaContattiSpecialiPerNome(String nome) {
        Speciale []contattiSpeciali = Rubrica.getInstance().getContattiSpeciali();
        Speciale []contattiSpecialiTrovati = new Speciale[contattiSpeciali.length];
        for (int i = 0, j = 0;  i < contattiSpecialiTrovati.length; i++) {
            if (contattiSpeciali[i] == null) {
                break;
            }
            if (contattiSpeciali[i].getNome().toUpperCase().contains(nome.toUpperCase())) {
                contattiSpecialiTrovati[j] = contattiSpeciali[i];
                j++;
            }
        }
        return contattiSpecialiTrovati;
    }
}