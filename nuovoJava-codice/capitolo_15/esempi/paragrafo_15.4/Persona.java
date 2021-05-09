import java.io.*;
import java.time.*;

public class Persona implements java.io.Serializable {
    private static final long serialVersionUID = 8848963813726842888L;
    private String nome;
    private String cognome;
    private transient Thread t = new Thread();
    private transient /* static */ String codiceSegreto;

    public Persona(String nome, String cognome, String codiceSegreto) {
        this.setNome(nome);
        this.setCognome(cognome);
        this.setCodiceSegreto(codiceSegreto);
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

    public void setCodiceSegreto(String codiceSegreto) {
        this.codiceSegreto = codiceSegreto;
    }

    public String getCodiceSegreto() {
        return codiceSegreto;
    }

    public String toString() {
        return"Nome: "+ getNome() + "\nCognome: "+ getCognome() + "\nCodice Segreto: "+ getCodiceSegreto();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(Instant.now());
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        cognome ="***********";
        System.out.println("Orario serializzazione: "+ in.readObject());
    }
}