package com.claudiodesio.sportello.dati;

public class Sportello {

    private final Stampante stampante;
    private static Sportello instance;

    public synchronized static Sportello getInstance() {
        if (instance == null) {
            instance = new Sportello();
        }
        return instance;
    }

    private Sportello() {
        stampante = Stampante.getInstance();
    }

    public synchronized void gestisciRichiesta(Richiedente richiedente) {
        System.out.println("Buongiorno " + richiedente);
        System.out.println("Impiegato dice: \"Prego compili il modulo "
                + richiedente + "\"");
        compilaModulo(richiedente);
        stampante.stampa(richiedente);
        System.out.println(richiedente + " dice: \"Grazie a lei!\"");
    }

    private synchronized void compilaModulo(Richiedente richiedente) {
        System.out.println("Richiedente " + richiedente + " dice: \"OK lo compilo subito ma...\"");
        final int attesa = TimeUtils.getNumeroRandom();
        try {
            System.out.println("...mi servono " + attesa + " minuti...");
            wait(attesa * 1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("Richiedente " + richiedente + " dice: \"...ho compilato il modulo!\"");
    }
}