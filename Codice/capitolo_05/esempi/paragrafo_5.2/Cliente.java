public class Cliente {
    private String nome;
    private String indirizzo;
    private String numeroDiTelefono;
    
    public Cliente (String nome, String indirizzo) {
        this(nome,indirizzo,"sconosciuto");
    }
    public Cliente(String nome, String indirizzo, String numeroDiTelefono) {
        this.setNome(nome);
        this.setIndirizzo(indirizzo);
        this.setNumeroDiTelefono( numeroDiTelefono);
    }
    public void setNumeroDiTelefono(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }
    public String getIndirizzo() {
        return indirizzo;
    }
    // . . .
}