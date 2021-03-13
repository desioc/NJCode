package com.claudiodesio.autenticazione;

public class Stampa {

    public static void richiediUsername() {
        stampaMessaggio("Inserisci username.");
    }

    public static void richiediPassword() {
        stampaMessaggio("Inserisci password.");
    }

    public static void auguraBenvenuto(String nome) {
        stampaMessaggio("Benvenuto " + nome);
    }

    public static void usernameInesistente() {
        stampaMessaggio("Utente non trovato!");
    }

    public static void autenticazioneFallita() {
        stampaMessaggio("Autenticazione fallita");
    }

    private static void stampaMessaggio(String messaggio) {
        System.out.println(messaggio);
    }

}