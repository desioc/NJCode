package com.claudiodesio.collections;

import com.claudiodesio.eccezioni.DuplicatoException;
import java.util.HashSet;

public class SetRobusto<E> extends HashSet<E> {

    @Override
    public boolean add(E e) {
        boolean result = super.add(e);
        if (!result) {
            throw new DuplicatoException(e);
        }
        return result;
    }

}