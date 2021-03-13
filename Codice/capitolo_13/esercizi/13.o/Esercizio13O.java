package com.claudiodesio.lambda.test;

import java.util.Arrays;
import java.util.Comparator;

public class Esercizio13O {
    static String nomi[] = {"Clarissa","Jem","Top","Ermeringildo","Iamaca",
"Tom","Arlequin","Francesca","Cumbus","Blue"
    } ;

    static int compareLunghezza(String first, String second) {
        return -(Integer.compare(first.length(), second.length()));
    }

    static int compareLunghezzaAlContrario(String first, String second) {
        return (Integer.compare(first.length(), second.length()));
    }

    static int compareAlfabeticoAlContrario(String first, String second) {
        return -(first.compareTo(second));
    }

    static int compareLunghezzaEAlfabeticoAlContrario(String first, String second) {
        int result = -Integer.compare(first.length(),
        second.length());
        if (result == 0) {
            result = first.compareTo(second);
        }
        return result;
    }

    public static void main(String args[]) {
       
        Arrays.sort(nomi, Esercizio16O::compareLunghezza);
        System.out.println("Nomi ordinati per lunghezza: "+
        Arrays.asList(nomi));

        Arrays.sort(nomi, Esercizio16O::compareLunghezzaAlContrario);
        System.out.println("Nomi ordinati per lunghezza al contrario: "+
        Arrays.asList(nomi));

        Arrays.sort(nomi, String::compareTo);
        System.out.println("Nomi ordinati : "+ Arrays.asList(nomi));

        Arrays.sort(nomi, Esercizio16O::compareAlfabeticoAlContrario);
        System.out.println("Nomi ordinati al contrario: "+
        Arrays.asList(nomi));

        Arrays.sort(nomi, Esercizio16O::compareLunghezzaEAlfabeticoAlContrario);
        System.out.println(
            "Nomi ordinati per lunghezza al contrario e in ordine alfabetico: "
            + Arrays.asList(nomi));
    }
}