package rubrica.dati;

public class Contatto extends Entita {
    protected static final String SCONOSCIUTO ="sconosciuto";
    private String nome;
    private String numeroDiTelefono;
    private String indirizzo;

    public Contatto(String nome, String numeroDiTelefono) {
        this(nome, numeroDiTelefono, SCONOSCIUTO);
    }

    public Contatto(String nome, String numeroDiTelefono, String indirizzo) {
        super();
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

    @Override
    public String toString() {
        return super.toString() +"\nNome="+ nome +
        "\nNumeroDiTelefono="+ numeroDiTelefono +"\nIndirizzo="+ indirizzo;
    }
}