package com.claudiodesio.eccezioni;

public class DuplicatoException extends RuntimeException {

    public DuplicatoException(Object elementoDuplicato) {
        super("Impossibile aggiungere l'elemento \""
                + elementoDuplicato + "\" perchè già  presente");
    }

}