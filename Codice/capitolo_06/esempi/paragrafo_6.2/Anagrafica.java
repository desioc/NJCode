public class Anagrafica {
    private String nome, cognome;
    public Anagrafica (String nome, String cognome){
        setNome(nome);
        setCognome(cognome);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCognome() {
        return cognome;
    }



    public void stampaAnagrafica() {
        System.out.println(nome + " " + cognome);
    }
    //accessor e mutator methods (set e get)
}