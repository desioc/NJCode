package com.claudiodesio.test;

import com.claudiodesio.collections.SetRobusto;
import com.claudiodesio.dati.Citta;

public class TestStreams {

    public static void main(String args[]) {
        SetRobusto<Citta> set = getSetRobusto();
        System.out.println("Città  di mare:");
        set.stream().filter(e->e.isDiMare()).forEach(System.out::println);
        System.out.println("\nCittà  capoluogo:");
        set.stream().filter(e->e.isCapoluogo()).forEach(System.out::println);
        System.out.println("\nCittà  che finiscono con 'a':");
        set.stream().filter(e->e.getNome().endsWith("a")).forEach(System.out::println);
    }

    public static SetRobusto<Citta> getSetRobusto() {
        SetRobusto<Citta> set = new SetRobusto<>();
        set.add(new Citta("Milano", true, false));
        set.add(new Citta("Rovigo", false, false));
        set.add(new Citta("Potenza", true, false));
        set.add(new Citta("Siracusa", false, true));
        set.add(new Citta("Perugia", true, false));
        set.add(new Citta("Napoli", true, true));
        set.add(new Citta("Pescara", false, true));
        set.add(new Citta("Taranto", false, true));
        set.add(new Citta("Siena", false, false));
        return set;
    }
}