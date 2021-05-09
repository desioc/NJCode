package rubrica.dati;

import rubrica.eccezioni.*;

public class Contatto extends Entita {
    protected static final String SCONOSCIUTO ="sconosciuto";
    private String nome;
    private String numeroDiTelefono;
    private String indirizzo;

    public Contatto(String nome, String numeroDiTelefono) throws NomeVuotoException {
        this(nome, numeroDiTelefono, SCONOSCIUTO);
    }

    public Contatto(String nome, String numeroDiTelefono, String indirizzo) throws NomeVuotoException {
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

    public void setNome(String nome) throws NomeVuotoException {
        if (nome == null || nome.trim().length() == 0) {
            throw new NomeVuotoException();
        }
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return"Nome:\t"+ nome +"\nIndirizzo:\t"+ indirizzo +"\nTelefono:\t"+ numeroDiTelefono;
    }
}