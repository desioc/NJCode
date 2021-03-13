package com.claudiodesio.rubrica.dati;

import java.io.Serializable;

public class Contatto implements Dato {  
    
    private static final long serialVersionUID = 8942402240056525661L;
    
    private String nome;

    private String indirizzo;

    private String numeroDiTelefono;

    public Contatto (String nome, String indirizzo, String numeroDiTelefono){
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.numeroDiTelefono = numeroDiTelefono;
    }
    
    public void setNumeroDiTelefono(String numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public String getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString(){
        return "Nome:\t" + nome + "\nIndirizzo:\t" + indirizzo + "\nTelefono:\t" + numeroDiTelefono;
    }
}