package com.claudiodesio.test;

import com.claudiodesio.collections.MappaIncrementale;
import com.claudiodesio.collections.MappaIncrementaleRobusta;
import com.claudiodesio.eccezioni.DuplicatoException;

public class TestMappaIncrementaleRobusta {

    public static void main(String args[]) {
        
        MappaIncrementale<Integer, String> mappa = new MappaIncrementaleRobusta<>();
        TestMappaIncrementale.riempiMappaIncrementale(mappa);
        try {
            mappa.add(4, "Grecia");
        } catch (DuplicatoException duplicatoException) {
            System.out.println(duplicatoException.getMessage());
        }
        System.out.println(mappa);
    }
}