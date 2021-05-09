package rubrica.test;

import rubrica.dati.*;
import rubrica.eccezioni.*;
import rubrica.integrazione.*;
import rubrica.util.*;

public class Esercizio15L {
    private GestoreSerializzazione<Contatto> gestoreFile;

    private Contatto[] contatti;

    Esercizio15L() {
        contatti = getContatti();
        gestoreFile = new GestoreFileNIO2();
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

    public void creaContatti() {
        for (Contatto contatto : contatti) {
            creaContatto(contatto);
        }
    }

    public void recuperaContatti() {
        for (Contatto contatto : contatti) {
            recuperaContatto(contatto.getNome());
        }
    }

    public void creaContattoEsistente() {
        creaContatto(contatti[0]);
    }

    public void modificaContattoEsistente() {
        Contatto contatto = new Contatto("Daniele","Via dei microfoni 1","07890");
        String messaggio ="Contatto "+ contatto.getNome() +" modificato!\n"+ contatto;
        esegui(()->gestoreFile.modifica(contatto), messaggio);
    }

    public void rimuoviContattoEsistente() {
        String nome = contatti[2].getNome();
        String messaggio ="Contatto "+ nome +" cancellato!";
        esegui(()->gestoreFile.rimuovi(nome), messaggio);
    }

    public void modificaContattoNonEsistente() {
        Contatto contatto = new Contatto("Pluto","Via dei microfoni 1","07890");
        String messaggio ="Contatto "+ contatto.getNome() +" modificato!";
        esegui(()->gestoreFile.modifica(contatto), messaggio);
    }

    public void rimuoviContattoNonEsistente() {
        String nome ="Ligeia";
        String messaggio ="Contatto "+ nome +" cancellato!";
        esegui(()->gestoreFile.rimuovi(nome), messaggio);
    }

    public void recuperaContattoNonEsistente() {
        recuperaContatto("Pippo");
    }

    public void recuperaContatto(String nomeContatto) {
        esegui(()->gestoreFile.recupera(nomeContatto));
    }

    private void creaContatto(Contatto contatto) {
        String messaggio ="Contatto "+ contatto.getNome() +" creato!\n"+ contatto;
        esegui(()->gestoreFile.inserisci(contatto), messaggio);
    }

    private Contatto[] getContatti() {
        Contatto contatto1 = new Contatto("Daniele","01234560","Via delle chitarre 1");
        Contatto contatto2 = new Contatto("Giovanni","0565432190","Via delle scienze 2");
        Contatto contatto3 = new Contatto("Ligeia","07899921","Via dei segreti 3");
        Contatto[] contatti = {
            contatto1, contatto2, contatto3
        } ;
        return contatti;
    }

    public <O> O esegui(Retriever<O> retriever) {
        O output = null;
        try {
            output = retriever.esegui();
            System.out.println("Contatto recuperato!\n"+ output);
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
        return output;
    }

    public void esegui(Executor executor, String messaggio) {
        try {
            executor.esegui();
            System.out.println(messaggio);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public static void main(String args[]) {
        Esercizio15L esercizio15L = new Esercizio15L();
        esercizio15L.eseguiTest();
    }
}