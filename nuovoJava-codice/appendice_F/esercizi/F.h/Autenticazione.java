package com.claudiodesio.autenticazione;

import java.util.Scanner;

public class Autenticazione {
    public void login() {
        String username = System.getProperty("username");
        System.out.println(username);
        String password = System.getProperty("password");
                System.out.println(password);
        Utente utente = trovaUtente(username);
        if (utente != null) {
            if (verificaPassword(utente, password)) {
                Stampa.auguraBenvenuto(utente.getNome());
            } else {
                Stampa.autenticazioneFallita();
            }
        } else {
            Stampa.usernameInesistente();
        }
    }

    private Utente trovaUtente(String username) {
        Utente[] utenti = ProfiliUtenti.getInstance().getUtenti();
        if (username != null) {
            for (Utente utente : utenti) {
                if (username.equals(utente.getUsername())) {
                    return utente;
                }
            }
        }
        return null;
    }

    private boolean verificaPassword(Utente utente, String password) {
        boolean trovato = false;
        if (password != null) {
            if (password.equals(utente.getPassword())) {
                trovato = true;
            }
        }
        return trovato;
    }

    public static void main(String args[]) {
        Autenticazione autenticazione = new Autenticazione();
        autenticazione.login();
    }
}