package rubrica.integrazione;
import java.util.*;
import java.io.*;
import rubrica.dati.*;
import rubrica.eccezioni.*;
import rubrica.util.*;

public class GestoreFile {
    
    public void inserisci(Contatto contatto) throws ContattoEsistenteException, FileNotFoundException, IOException {
        Contatto contattoEsistente = getContatto(FileUtils.getNomeFile(contatto.getNome()));
        if (contattoEsistente != null) {
            throw new ContattoEsistenteException(contatto.getNome()
            +": contatto già esistente!");
        }
        try (FileOutputStream fos = new FileOutputStream (
        new File(FileUtils.getNomeFile(contatto.getNome())));
        ObjectOutputStream s = new ObjectOutputStream (fos);) {
            s.writeObject (contatto);
        }
    }

    public Contatto recupera(String nome) throws ContattoInesistenteException {
        Contatto contatto = getContatto(FileUtils.getNomeFile(nome));
        if (contatto == null) {
            throw new ContattoInesistenteException(nome +": contatto non trovato!");
        }
        return contatto;
    }

    private Contatto getContatto(String nome) {
        try (FileInputStream fis = new FileInputStream (new File(nome));
        ObjectInputStream ois = new ObjectInputStream (fis);) {
            Contatto contatto = (Contatto)ois.readObject();
            return contatto;
        } catch (Exception exc) {
            return null;
        }
    }

     /* public void inserisci(Contatto contatto) throws IOException {
        try (FileOutputStream fos =
        new FileOutputStream (FileUtils.getNomeFile(contatto.getNome()));
        ObjectOutputStream s = new ObjectOutputStream (fos);) {
            s.writeObject (contatto);
        } 
    }

    public Contatto recupera(String nome) throws IOException, ClassNotFoundException {
        Contatto contatto = null;
        try (FileInputStream fis = new FileInputStream (FileUtils.getNomeFile(nome));
        ObjectInputStream ois = new ObjectInputStream (fis);) {
            contatto = (Contatto)ois.readObject();
        } 
        return contatto;
    }*/
}