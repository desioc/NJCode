package rubrica.test;

import rubrica.dati.*;
import rubrica.eccezioni.*;
import rubrica.integrazione.*;

public class Esercizio15H {
    private GestoreFile gestoreFile;
    private Contatto[] contatti;

    Esercizio15H() {
        contatti = getContatti();
        gestoreFile = new GestoreFile();
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
    }

    public void creaContattoEsistente() {
            creaContatto(contatti[0]);
    }

    public void recuperaContattoNonEsistente() {
            recuperaContatto("Pippo");
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
    
    private void creaContatto(Contatto contatto) {
        try {
            gestoreFile.inserisci(contatto);
            System.out.println("Contatto creato:\n"+ contatto);
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public void recuperaContatto(String nomeContatto) {
        try {
            Contatto contatto = gestoreFile.recupera(nomeContatto);
            System.out.println("Contatto recuperato:\n"+contatto);
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    private Contatto[] getContatti() {
        Contatto contatto1 = new Contatto("Daniele", "01234560", "Via delle chitarre 1" );
        Contatto contatto2 = new Contatto("Giovanni", "0565432190", "Via delle scienze 2");
        Contatto contatto3 = new Contatto("Ligeia", "07899921", "Via dei segreti 3");
        Contatto[] contatti = {
            contatto1, contatto2, contatto3
        } ;
        return contatti;
    }

    public static void main(String args[]) {
        Esercizio15H esercizio15H = new Esercizio15H();
        esercizio15H.eseguiTest();
    }
}