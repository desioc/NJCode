public class Contatto {
    protected static final String SCONOSCIUTO ="sconosciuto";
    private String nome;
    private String numeroDiTelefono;
    private String indirizzo;

    public Contatto(String nome, String numeroDiTelefono) {
        this.setNome(nome);
        this.setNumeroDiTelefono(numeroDiTelefono);
        this.setIndirizzo(SCONOSCIUTO);
    }

    public Contatto(String nome, String numeroDiTelefono, String indirizzo) {
        this.setNome(nome);
        this.setNumeroDiTelefono(numeroDiTelefono);
        this.setIndirizzo(indirizzo);
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setNumeroDiTelefono(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void stampaDettagli() {
        System.out.println(nome);
        System.out.println(indirizzo);
        System.out.println(numeroDiTelefono);
        System.out.println();
    }
}