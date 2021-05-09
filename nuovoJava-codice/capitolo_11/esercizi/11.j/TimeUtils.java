package com.claudiodesio.sportello.dati;

import java.util.*;

public class TimeUtils {

    private static final Random RANDOM = new Random();

    public static int getNumeroRandom() {
        return (RANDOM.nextInt(6) + 5);
    }
}