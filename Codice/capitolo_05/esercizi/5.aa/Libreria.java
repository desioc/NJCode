public class Libreria {
    private String nome;
    private Scaffale[] scaffali;
    private static Libreria instance;
    
    private Libreria() {
        scaffali = new Scaffale[GenereUtils.generi.length];
    }
   
   public static Libreria getInstance(){
        if (instance == null) {
            instance = new Libreria();
        }
        return instance;
    }
   
   public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void aggiungiScaffale(Scaffale scaffale) {
        if (scaffali[scaffali.length-1] != null) {
            System.out.println("Questa libreria ha già tutti gli scaffali!");    
            return;
        }
        for (int i = 0; i < scaffali.length; i++) {
            if (scaffali[i] == null) {
                scaffali[i] = scaffale;
                break;
            } else if (scaffali[i].getGenere().equals(scaffale.getGenere())) {
                System.out.println("Scaffale genere " + scaffale.getGenere() + " già esistente!");
                break;
            } 
        }
    }

    public Scaffale[] getScaffali() {
        return scaffali;
    }
}