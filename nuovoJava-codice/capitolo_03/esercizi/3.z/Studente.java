public class Studente {
    public String nome;
    public String cognome;
    public String classe;

    public Studente(String nom, String cog, String cla) {
        nome = nom;
        cognome = cog;
        classe = cla;
    }

    public String toString() {
        return "Studente: "+ nome +" "+ cognome +"\nClasse "+ classe;
    }
}