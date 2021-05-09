package com.claudiodesio.autenticazione;

import java.io.*;

public class EsercizioGG {
    
    public static void main(String args[]) throws IOException {
        System.out.println(args);
        if (args.length != 4) {
            System.out.println("Specificare ruolo, nome, username, password");
            System.exit(1);
        }
        ProfiliUtenti.getInstance().inserisciUtente(args);
    }
}