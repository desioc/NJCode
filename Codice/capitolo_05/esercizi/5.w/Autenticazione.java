package com.claudiodesio.autenticazione;

import java.util.Scanner;

public class Autenticazione {

    public void login() {
        boolean autorizzato = false;
        Scanner scanner = new Scanner(System.in);
        do {
            Stampa.richiediUsername();
            String username = scanner.nextLine();
            Utente utente = trovaUtente(username);
            if (utente != null) {
                Stampa.richiediPassword();
                String password = scanner.nextLine();
                if (verificaPassword(utente, password)) {
                    Stampa.auguraBenvenuto(utente.getNome());
                    autorizzato = true;
                } else {
                    Stampa.autenticazioneFallita();
                }
            } else {
                Stampa.usernameInesistente();
            }
        } while (!autorizzato);
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

//    private boolean verificaUsername(String username) {
//        Utente[] utenti = ProfiliUtenti.getInstance().getUtenti();
//        boolean trovato = false;
//        Utente utente = trovaUtente(username);
//        if (utente != null && username.equals(utente.getUsername())) {
//            trovato = true;
//        }
//        return trovato;
//    }
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
