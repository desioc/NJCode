package com.claudiodesio.rubrica.io;

import com.claudiodesio.rubrica.spi.GestoreSerializzazione;
import com.claudiodesio.rubrica.dati.Contatto;
import com.claudiodesio.rubrica.eccezioni.*;
import com.claudiodesio.rubrica.util.*;
import java.util.*;
import java.io.*;

public class GestoreFile implements GestoreSerializzazione<Contatto> {
    
    @Override
    public void inserisci(Contatto contatto) throws ContattoEsistenteException, FileNotFoundException, IOException {
        Contatto contattoEsistente = getContatto(contatto.getNome());
        if (contattoEsistente != null) {
            throw new ContattoEsistenteException(contatto.getNome() +": contatto gi� esistente!");
        }
        registra( contatto);
    }

    @Override
    public Contatto recupera(String nome) throws ContattoInesistenteException, ContattoEsistenteException {
        Contatto contatto = getContatto(nome);
        if (contatto == null) {
            throw new ContattoInesistenteException(nome + ": contatto non trovato!");
        }
        return contatto;
    }

    @Override
    public void modifica(Contatto contatto) throws ContattoInesistenteException, ContattoEsistenteException, FileNotFoundException, IOException {
        if (isContattoEsistente(contatto.getNome())) {
            registra(contatto);
        } else {
            throw new ContattoInesistenteException(contatto.getNome() +": contatto non trovato!");
        }
    }

    @Override
    public void rimuovi(String nome) throws ContattoInesistenteException, ContattoEsistenteException, FileNotFoundException, IOException {
        File file = new File(FileUtils.getNomeFile(nome));
        if (file.delete()) {
            System.out.println("Contatto " + nome + " cancellato!");
        } else {
            throw new ContattoInesistenteException(nome +": contatto non trovato!");
        }
    }

    private void registra(Contatto contatto) throws  FileNotFoundException, IOException {
        try (FileOutputStream fos =
        new FileOutputStream (new File(FileUtils.getNomeFile(contatto.getNome())));
        ObjectOutputStream s = new ObjectOutputStream (fos);) {
            s.writeObject (contatto);
            System.out.println("Contatto registrato:\n"+ contatto);
        }
    }

    private boolean isContattoEsistente(String nome) {
        File file = new File(FileUtils.getNomeFile(nome));
        return file.exists();
    }

    private Contatto getContatto(String nome) {
        try (FileInputStream fis = new FileInputStream (new File(FileUtils.getNomeFile(nome)));
        ObjectInputStream ois = new ObjectInputStream (fis);) {
            Contatto contatto = (Contatto)ois.readObject();
            System.out.println("Contatto recuperato:\n"+ contatto);
            return contatto;
        } catch (Exception exc) {
            return null;
        }
    }
}