package rubrica.business;
import rubrica.dati.*;

public class Utente {
    public Contatto[] cercaContattiPerNome(String nome) {
        Contatto []contatti = Rubrica.getInstance().getContatti();
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
    
    public Contatto[] cercaContattiOrdinariPerNome(String nome) {
        Contatto []contattiOrdinari = Rubrica.getInstance().getContattiOrdinari();
        Contatto []contattiOrdinariTrovati = new Contatto[contattiOrdinari.length];
        for (int i = 0, j = 0;  i < contattiOrdinariTrovati.length; i++) {
            if (contattiOrdinari[i] == null) {
                break;
            }
            if (contattiOrdinari[i].getNome().toUpperCase().contains(nome.toUpperCase())) {
                contattiOrdinariTrovati[j] = contattiOrdinari[i];
                j++;
            }
        }
        return contattiOrdinariTrovati;
    }
}