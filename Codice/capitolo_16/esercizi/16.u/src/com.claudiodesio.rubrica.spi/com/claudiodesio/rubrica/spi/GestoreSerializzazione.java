package com.claudiodesio.rubrica.spi;

import com.claudiodesio.rubrica.dati.Dato;

import java.io.*;

import java.util.*;

public interface GestoreSerializzazione<T extends Dato> {
   
    void inserisci(T dato) throws IOException;
    
    T recupera(String id) throws IOException, ClassNotFoundException;
    
    void modifica(T dato) throws IOException;
    
    void rimuovi(String id) throws IOException;
}