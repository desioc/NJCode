package rubrica.test;

import rubrica.dati.*;
import rubrica.eccezioni.*;
import rubrica.integrazione.*;

public class Esercizio15J {
    
    private GestoreSerializzazione<Contatto> gestoreFile;

    private Contatto[] contatti;

    Esercizio15J() {
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
        try {
            Contatto contatto = new Contatto("Daniele","Via dei microfoni 1","07890");
            gestoreFile.modifica(contatto);
            System.out.println("Contatto "+ contatto.getNome() +" modificato!\n" + contatto);
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
    public void rimuoviContattoEsistente() {
        try {
            gestoreFile.rimuovi(contatti[2].getNome());
            System.out.println("Contatto "+ contatti[2].getNome() +" cancellato!");
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public void modificaContattoNonEsistente() {
        try {
            Contatto contatto = new Contatto("Pluto","Via dei microfoni 1","07890");
            gestoreFile.modifica(contatto);
            System.out.println("Contatto "+ contatto.getNome() +" modificato!");
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
    public void rimuoviContattoNonEsistente() {
        try {
            String nome ="Ligeia";
            gestoreFile.rimuovi(nome);
            System.out.println("Contatto "+ nome +" cancellato!");
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    public void recuperaContattoNonEsistente() {
        recuperaContatto("Pippo");
    }

    public void recuperaContatto(String nomeContatto) {
        try {
            Contatto contatto = gestoreFile.recupera(nomeContatto);
            System.out.println("Contatto recuperato!\n"+ contatto);
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }

    private void creaContatto(Contatto contatto) {
        try {
            gestoreFile.inserisci(contatto);
            System.out.println("Contatto "+ contatto.getNome() +" creato!\n"+ contatto);
        }
        catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
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

    public static void main(String args[]) {
        Esercizio15J esercizio15J = new Esercizio15J();
        esercizio15J.eseguiTest();
    }
}