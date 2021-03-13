package com.claudiodesio.autenticazione;

import java.util.*;
import java.io.*;

public class ProfiliUtenti {
    private static ProfiliUtenti instance;

    private Properties properties;

    private ProfiliUtenti() {
        properties = new Properties();
        try {
            loadProperties();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void loadProperties() throws IOException {
        try (FileInputStream inputStream = new FileInputStream("config.properties");) {
            properties.load(inputStream);
        }
    }

    public static ProfiliUtenti getInstance() {
        if (instance == null) {
            instance = new ProfiliUtenti();
        }
        return instance;
    }

    public void inserisciUtente(String[] args) throws IOException {
        System.out.println(args);
        String ruolo = args[0];
        String nome= args[1];
        String username = args[2];
        String password = args[3];
        // Se non si specifica il ruolo Amministratore
        // verrà inserito sempre un Commesso
        Utente utente = (ruolo.equals("Amministratore") ?
            new Amministratore(nome, username, password):
            new Commesso(nome, username, password));
        String valore = nome +","+ ruolo+","+ password;
        System.out.println("Inserisco la proprietà: "+ username +"="+ valore);
        properties.setProperty(username, valore);
        try (FileOutputStream fos = new FileOutputStream("config.properties")){
            properties.store(fos,"File di configurazione");
        }
        System.out.println("Inserita la proprietà: "+ username +"="+ valore);
    }
}