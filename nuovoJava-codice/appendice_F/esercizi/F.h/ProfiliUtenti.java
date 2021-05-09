package com.claudiodesio.autenticazione;

public class ProfiliUtenti {

    private static ProfiliUtenti instance;

    private Utente[] utenti;

    private ProfiliUtenti() {
        utenti = creaUtenti();
    }

    public static ProfiliUtenti getInstance() {
        if (instance == null) {
            instance = new ProfiliUtenti();
        }
        return instance;
    }

    private Utente[] creaUtenti() {
        Utente[] utenti = {
            new Utente("Daniele", "dansap", "musica"),
            new Utente("Giovanni", "giobat", "scienze"),
            new Utente("Ligeia", "ligder", "arte")
        };
        return utenti;
    }

    public void setUtenti(Utente[] utenti) {
        this.setUtenti(utenti);
    }

    public Utente[] getUtenti() {
        return utenti;
    }

}