package com.claudiodesio.test;

import com.claudiodesio.collections.MappaIncrementale;
import com.claudiodesio.collections.SetRobusto;
import java.util.Iterator;

public class TestMappaIncrementale {

    public static void main(String args[]) {
        MappaIncrementale<Integer, String> mappa = new MappaIncrementale<>();
        riempiMappaIncrementale( mappa);
        System.out.println(mappa);

    }

    public static void riempiMappaIncrementale(MappaIncrementale<Integer, String> mappa) {
        SetRobusto<String> set = TestSetRobusto.getSetRobusto();
        int i = 1;
        int j = 1;
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (i % 3 == 0) {
                j++;
            }
            String string = iterator.next();
            mappa.add(j, string);
            i++;
        }
    }
}