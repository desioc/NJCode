public abstract class File {

    private String nome;

    private TipoFile tipo;

    public File(String nome, TipoFile tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoFile getTipo() {
        return tipo;
    }

    public void setTipo(TipoFile tipo) {
        this.tipo = tipo;
    }
} 