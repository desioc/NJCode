package com.claudiodesio.sportello.test;

import com.claudiodesio.sportello.dati.Richiedente;

public class TestSportello {
    
    public static void main(String args[]){
        final Richiedente[] richiedenti = getRichiedenti();
        for (Richiedente richiedente : richiedenti) {
            richiedente.start();
        }
    }
    
    private static Richiedente[] getRichiedenti() {
        Richiedente[] partecipanti = {
            new Richiedente("Ciro"),
            new Richiedente("Mario"),
            new Richiedente("Massimo"),
            new Richiedente("Chicco"),
            new Richiedente("Enrico"),
            new Richiedente("Lorenzo"),
            new Richiedente("Emanuele"),
            new Richiedente("Cosimo"),
            new Richiedente("Alessandro"),
            new Richiedente("Salvatore")};
        return partecipanti;
    }
}