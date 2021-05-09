package com.claudiodesio.test;

import com.claudiodesio.collections.SetRobusto;
import com.claudiodesio.eccezioni.DuplicatoException;

public class TestSetRobusto {

    public static void main(String args[]) {
        SetRobusto<String> set = getSetRobusto();
        try {
            set.add("Italia");
        } catch (DuplicatoException duplicatoException) {
            System.out.println(duplicatoException.getMessage());
        }
        System.out.println(set);
    }

    public static SetRobusto<String> getSetRobusto() {
        SetRobusto<String> set = new SetRobusto<>();
        set.add("Italia");
        set.add("Francia");
        set.add("Polonia");
        set.add("Germania");
        set.add("Inghilterra");
        set.add("Spagna");
        set.add("Grecia");
        set.add("Olanda");
        set.add("Portogallo");
        set.add("Belgio");
        return set;
    }
}