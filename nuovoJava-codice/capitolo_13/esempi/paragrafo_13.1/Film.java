public class Film {
    private String nome;
    private String genere;
    private int mediaRecensioni;

    public Film (String nome, String genere, int mediaRecensioni) {
        this.nome = nome;
        this.genere = genere;
        this.mediaRecensioni = mediaRecensioni;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setMediaRecensioni(int mediaRecensioni) {
        this.mediaRecensioni = mediaRecensioni;
    }

    public int getMediaRecensioni() {
        return mediaRecensioni;
    }


    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getGenere() {
        return genere;
    }
    
    public String toString(){
        return getNome();
    }
}