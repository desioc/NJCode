package rubrica.integrazione;

import java.util.*;
import java.io.*;
import rubrica.dati.*;
import rubrica.eccezioni.*;
import rubrica.util.*;

public interface GestoreSerializzazione<T extends Dato> {
   
    void inserisci(T dato) throws IOException;
    
    T recupera(String id) throws IOException, ClassNotFoundException;
    
    void modifica(T dato) throws IOException;
    
    void rimuovi(String id) throws IOException;
    
    List<Contatto> getContatti() throws IOException;
}