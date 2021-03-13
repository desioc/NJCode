package com.claudiodesio.lambda.test;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparators {
    
    static String nomi[] = {"Clarissa", "Jem", "Top", "Ermeringildo", 
            "Iamaca", "Tom", "Arlequin", "Francesca", "Cumbus", "Blue"};

    public static void main(String args[]) {
        Comparator<String> comparatorLunghezza = (first, second)
                -> -(Integer.compare(first.length(), second.length()));

        Comparator<String> comparatorLunghezzaAlContrario = (first, second)
                -> (Integer.compare(first.length(), second.length()));

        Comparator<String> comparatorAlfabeticoAlContrario = (first, second)
                -> -(first.compareTo(second));

        Comparator<String> comparatorLunghezzaEAlfabeticoAlContrario = (first, second)
                -> {
                    int result = -Integer.compare(first.length(), second.length());
                    if (result == 0) {
                        result = first.compareTo(second);
                    }
                    return result;
                };
        Arrays.sort(nomi, comparatorLunghezza);
        System.out.println("Nomi ordinati per lunghezza: " + Arrays.asList(nomi));

        Arrays.sort(nomi, comparatorLunghezzaAlContrario);
        System.out.println("Nomi ordinati per lunghezza al contrario: " + Arrays.asList(nomi));

        Arrays.sort(nomi, String::compareTo);
        System.out.println("Nomi in ordine alfabetico: " + Arrays.asList(nomi));

        Arrays.sort(nomi, comparatorAlfabeticoAlContrario);
        System.out.println("Nomi in ordine alfabetico inverso: " + Arrays.asList(nomi));

        Arrays.sort(nomi, comparatorLunghezzaEAlfabeticoAlContrario);
        System.out.println("Nomi ordinati per lunghezza al contrario e in ordine alfabetico: " + Arrays.asList(nomi));
    }
}