public class Cliente {
    private String nome;
    private String indirizzo;
    private int numeroDiTelefono;
    public Cliente() {
        // costruttore inserito esplicitamente (non di default)
    }
    public Cliente(String nome) {
        this.nome = nome;
    }
    public Cliente(String nome, String indirizzo) {
        this(nome);
        this.indirizzo = indirizzo;
    }
    public Cliente(String nome, String indirizzo, int numeroDiTelefono) {
        this(nome, indirizzo);
        this.numeroDiTelefono = numeroDiTelefono;
    }
//    . . .
}
