package com.claudiodesio.autenticazione;

public class Utente {
    public String nome;
    public String username;
    public String password;
    
    public Utente(String n, String u, String p) {
        this.nome = n;
        this.username = u;
        this.password = p;
    }
}