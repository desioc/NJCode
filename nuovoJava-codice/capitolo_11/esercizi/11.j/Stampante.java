package com.claudiodesio.sportello.dati;

public class Stampante {

    private static Stampante instance;

    private Stampante() {
    }

    public static Stampante getInstance() {
        if (instance == null) {
            instance = new Stampante();
        }
        return instance;
    }

    public synchronized void stampa(Richiedente richiedente) {
        System.out.println("Stampa carta d'identità di " + richiedente
                + " in corso...");
        try {
            wait(3000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Stampa completata! " + richiedente
                + " grazie e arrivederci!");
    }
}