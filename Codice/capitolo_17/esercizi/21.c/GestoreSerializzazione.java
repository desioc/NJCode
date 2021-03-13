package rubrica.integrazione;

import java.util.*;
import java.io.*;
import rubrica.dati.*;
import rubrica.eccezioni.*;
import rubrica.util.*;

public interface GestoreSerializzazione<T extends Dato> {
   
    void inserisci(T dato) throws Exception;
    
    T recupera(String id) throws Exception;
    
    void modifica(T dato) throws Exception;
    
    void rimuovi(String id) throws Exception;
    
    List<Contatto> getContatti() throws Exception;
}