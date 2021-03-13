public class Azione {
    private String nome;
    public static final Azione AVANTI = new Azione("AVANTI");
    public static final Azione INDIETRO = new Azione("INDIETRO");
    public static final Azione FERMO = new Azione("FERMO");
    public Azione(String nome){
        setNome(nome);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}