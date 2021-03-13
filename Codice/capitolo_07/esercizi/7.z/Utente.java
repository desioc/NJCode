package rubrica.business;
import rubrica.dati.*;

public class Utente {
    
    private Rubrica rubrica;
    
    public Utente() {
        rubrica = Rubrica.getInstance();
    }
    
    public Contatto[] cercaContattiPerNome(String nome) {
        Contatto []contatti = rubrica.getContatti();
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
        Speciale []contattiSpeciali = rubrica.getContattiSpeciali();
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
        Contatto []contattiOrdinari = rubrica.getContattiOrdinari();
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
    
    public void inserisci(Contatto contattoDaAggiungere) {
        Contatto[] contatti = rubrica.getContatti();
        for (int i = 0; i < contatti.length; ++i) {
            if (contatti[i] == null) {
                contatti[i] = contattoDaAggiungere;
                break;
            }
        }
    }
}