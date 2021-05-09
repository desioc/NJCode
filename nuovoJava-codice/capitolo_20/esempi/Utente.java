import javafx.beans.property.*;

public class Utente {
    private StringProperty nome = new SimpleStringProperty("");

    public final StringProperty nomeProperty() {
        return nome;
    }
    public final void setNome(String nome) {
        this.nome.set(nome);
    }
    public final String getNome() {
        return nome.get();
    }
}