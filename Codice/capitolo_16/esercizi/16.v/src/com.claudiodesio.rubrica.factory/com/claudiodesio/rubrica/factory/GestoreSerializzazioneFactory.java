package com.claudiodesio.rubrica.factory;

import com.claudiodesio.rubrica.spi.GestoreSerializzazione;
import com.claudiodesio.rubrica.dati.Contatto;
import java.util.Iterator;
import java.util.ServiceLoader;

public class GestoreSerializzazioneFactory {
    public static GestoreSerializzazione<Contatto> getGestoreSerializzazione(String className){
        ServiceLoader<GestoreSerializzazione> serviceLoader = ServiceLoader.load(com.claudiodesio.rubrica.spi.GestoreSerializzazione.class);
        for (GestoreSerializzazione gestoreSerializzazione : serviceLoader) {
            if (gestoreSerializzazione.getClass().getSimpleName().equals(className)) {
                return gestoreSerializzazione;
            }
        }
        throw new IllegalArgumentException("Nessun gestore di serializzazione trovato per classe =" + className);
    }
}