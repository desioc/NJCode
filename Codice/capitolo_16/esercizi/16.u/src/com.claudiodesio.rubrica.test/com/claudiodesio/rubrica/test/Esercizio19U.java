package com.claudiodesio.rubrica.test;

import java.util.function.*;
import com.claudiodesio.rubrica.spi.GestoreSerializzazione;
import com.claudiodesio.rubrica.dati.Contatto;
import com.claudiodesio.rubrica.util.*;
import com.claudiodesio.rubrica.factory.GestoreSerializzazioneFactory;
import java.util.Iterator;
import java.util.ServiceLoader;

public class Esercizio19U {
    
    private GestoreSerializzazione<Contatto> gestoreFile;

    private Contatto[] contatti;

    public Esercizio19U(String className) {
        contatti = getContatti();
        gestoreFile = GestoreSerializzazioneFactory.getGestoreSerializzazione(className);
    }
    
   public GestoreSerializzazione<Contatto> getGestoreSerializzazione(String className){
        ServiceLoader<GestoreSerializzazione> serviceLoader = ServiceLoader.load(com.claudiodesio.rubrica.spi.GestoreSerializzazione.class);
        for (GestoreSerializzazione<Contatto> gestoreSerializzazione : serviceLoader) {
            if (gestoreSerializzazione.getClass().getSimpleName().equals(className)) {
                return gestoreSerializzazione;
            }
        }
        throw new IllegalArgumentException("Nessun gestore di serializzazione trovato per classe =" + className);
    }

    private void eseguiTest() {
        System.out.println("TESTIAMO LA CREAZIONE DEI TRE CONTATTI");
        creaContatti();
        System.out.println("RECUPERIAMO I TRE CONTATTI");
        recuperaContatti();
        System.out.println("TESTIAMO LA CREAZIONE DI UN CONTATTO GIÀ ESISTENTE");
        creaContattoEsistente();
        System.out.println("PROVIAMO A RECUPERARE UN CONTATTO NON ESISTENTE");
        recuperaContattoNonEsistente();
        System.out.println("MODIFICHIAMO UN CONTATTO ESISTENTE");
        modificaContattoEsistente();
        System.out.println("RIMUOVIAMO UN CONTATTO ESISTENTE");
        rimuoviContattoEsistente();
        System.out.println("MODIFICHIAMO UN CONTATTO NON ESISTENTE");
        modificaContattoNonEsistente();
        System.out.println("RIMUOVIAMO UN CONTATTO NON ESISTENTE");
        rimuoviContattoNonEsistente();
    }

    public void creaContattoEsistente() {
        esegui(()->gestoreFile.inserisci(contatti[0]));
    }

    public void modificaContattoEsistente() {        
        esegui(()->gestoreFile.modifica(new Contatto("Daniele","Via dei microfoni 1","07890")));
    }
    
    public void rimuoviContattoEsistente() {
        esegui(()->gestoreFile.rimuovi(contatti[2].getNome()));
    }

    public void modificaContattoNonEsistente() {
        esegui(()->gestoreFile.modifica(new Contatto("Pluto","Via dei microfoni 1","07890")));
    }
    
    public void rimuoviContattoNonEsistente() {
        esegui(()->gestoreFile.rimuovi("Ligeia"));
    }

    public void recuperaContattoNonEsistente() {
        esegui(()->gestoreFile.recupera("Pippo"));
    }

    public void creaContatti() {
        for (Contatto contatto : contatti) {
            System.out.println("Creazione contatto:\n"+ contatto);
            creaContatto(contatto);
        }
    }

    public void recuperaContatti() {
        for (Contatto contatto : contatti) {
            System.out.println("Recupero contatto: "+ contatto.getNome());
            recuperaContatto(contatto.getNome());
        }
    }

    public void recuperaContatto(String nomeContatto) {
        esegui(()->gestoreFile.recupera(nomeContatto));
    }

    private void creaContatto(Contatto contatto) {
        esegui(()->gestoreFile.inserisci(contatto));
    }

    private Contatto[] getContatti() {
        Contatto contatto1 = new Contatto("Daniele","Via delle chitarre 1","01234560");
        Contatto contatto2 = new Contatto("Giovanni","Via delle scienze 2","0565432190");
        Contatto contatto3 = new Contatto("Ligeia","Via dei segreti 3","07899921");
        Contatto[] contatti = {
            contatto1, contatto2, contatto3
        } ;
        return contatti;
    }

    public <O> O esegui(Retriever<O> retriever) {
        O output = null;
        try {
            output = retriever.esegui();
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return output;
    }
    
    public void esegui(Executor executor) {
        try {
            executor.esegui();
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String args[]) {
        Esercizio19U esercizio19U = new Esercizio19U(args[0]);
        esercizio19U.eseguiTest();
    }
}