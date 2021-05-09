package com.claudiodesio.autenticazione;
import java.util.Scanner;

public class Autenticazione {

    private static final Utente[] utenti = {
        new Utente("Daniele", "dansap", "musica"),
        new Utente("Giovanni", "giobat", "scienze"),
        new Utente("Ligeia", "ligder", "arte")
    };

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Inserisci username.");
            String username = scanner.nextLine();
            Utente utente = verificaUsername(username);
            if (utente == null) {
                System.out.println("Utente non trovato!");
                continue;
            }
            System.out.println("Inserisci password");
            String password = scanner.nextLine();
            if (password != null && password.equals(utente.getPassword())) {
                System.out.println("Benvenuto " + utente.getNome());
                break;
            } else {
                System.out.println("Autenticazione fallita");
            }
        }
    }

    private static Utente verificaUsername(String username) {
        if (username != null) {
            for (Utente utente : utenti) {
                if (username.equals(utente.getUsername())) {
                    return utente;
                }
            }
        }
        return null;
    }
}
