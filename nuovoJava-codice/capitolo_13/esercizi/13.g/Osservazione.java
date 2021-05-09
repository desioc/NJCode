package com.claudiodesio.osservatorio.test;

import com.claudiodesio.osservatorio.dati.Partecipante;
import com.claudiodesio.osservatorio.dati.Telescopio;

public class Osservazione {

    public static void main(String args[]) {
        Telescopio telescopio = new Telescopio();
        Partecipante[] partecipanti = getPartecipanti(telescopio);
        for (Partecipante partecipante : partecipanti) {
            partecipante.start();
        }
    }

    private static Partecipante[] getPartecipanti(Telescopio telescopio) {
        Partecipante[] partecipanti = {
            new Partecipante("Ciro", telescopio),
            new Partecipante("Gianluca", telescopio),
            new Partecipante("Pierluigi", telescopio),
            new Partecipante("Gigi", telescopio),
            new Partecipante("Nicola", telescopio) {
                @Override
                public void run() {
                    System.out.println(getNome() + " sono pronto!");
                    super.run();
                }

            },
            new Partecipante("Pino", telescopio),
            new Partecipante("Maurizio", telescopio),
            new Partecipante("Raffaele", telescopio),
            new Partecipante("Fabio", telescopio),
            new Partecipante("Vincenzo", telescopio)};
        return partecipanti;
    }
}
