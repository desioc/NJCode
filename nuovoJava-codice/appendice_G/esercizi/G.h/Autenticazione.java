package com.claudiodesio.autenticazione;

import java.util.Scanner;

public class Autenticazione {

    public void login() {
        boolean autorizzato = false;
        Scanner scanner = new Scanner(System.in);
        do {
            Stampa.richiediUsername();
            String username = scanner.nextLine();
            Utente utente = ProfiliUtenti.getInstance().getUtente(username);
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

    private boolean verificaPassword(Utente utente, String password) {
        boolean trovato = false;
        if (password != null) {
            if (password.equals(utente.getPassword())) {
                trovato = true;
            }
        }
        return trovato;
    }
}