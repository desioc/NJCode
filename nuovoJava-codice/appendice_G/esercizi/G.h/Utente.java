package com.claudiodesio.autenticazione;

public class Utente {

    private String nome;
    private String username;
    private String password;

    public Utente(String n, String u, String p) {
        this.nome = n;
        this.username = u;
        this.password = p;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}