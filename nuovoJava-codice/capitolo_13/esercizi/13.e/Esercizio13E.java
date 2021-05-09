package com.claudiodesio.lambda.test;

import com.claudiodesio.lambda.dati.Citta;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Esercizio13E {

    public static void main(String args[]) {
        List<Citta> listaCitta = getCitta();
        System.out.println("Città  di mare: " + filtraCitta(listaCitta, Esercizio13E::isDiMare));
        listaCitta = getCitta();
        System.out.println("Citt  capoluogo: " + filtraCitta(listaCitta, Esercizio13E::isCapoluogo));
        listaCitta = getCitta();
        stampaDettagli(listaCitta, (citta) -> System.out.println(citta.getNome()
                + (citta.isCapoluogo() ? " è capoluogo," : "")
                + (citta.isDiMare() ? " è città  di mare," : "")));
    }

    public static List<Citta> filtraCitta(List<Citta> listaCitta, Predicate<Citta> p) {
        final Iterator<Citta> iterator = listaCitta.iterator();
        while (iterator.hasNext()) {
            Citta citta = iterator.next();
            if (!p.test(citta)) {
                iterator.remove();
            }
        }
        return listaCitta;
    }

    public static void stampaDettagli(List<Citta> listaCitta, Consumer<Citta> p) {
        for (Citta citta : listaCitta) {
            p.accept(citta);
        }
    }

    private static List<Citta> getCitta() {
        List<Citta> citta = new ArrayList<>();
        citta.add(new Citta("Milano", true, false));
        citta.add(new Citta("Rovigo", false, false));
        citta.add(new Citta("Potenza", true, false));
        citta.add(new Citta("Siracusa", false, true));
        citta.add(new Citta("Perugia", true, false));
        citta.add(new Citta("Napoli", true, true));
        citta.add(new Citta("Pescara", false, true));
        citta.add(new Citta("Taranto", false, true));
        citta.add(new Citta("Siena", false, false));
        return citta;
    }

    public static boolean isDiMare(Citta citta) {
        return citta.isDiMare();
    }

    public static boolean isCapoluogo(Citta citta) {
        return citta.isCapoluogo();
    }
}