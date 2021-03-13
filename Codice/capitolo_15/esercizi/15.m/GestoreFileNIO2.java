package rubrica.integrazione;

import java.util.*;
import java.io.*;
import rubrica.dati.*;
import rubrica.eccezioni.*;
import rubrica.util.*;
import java.nio.file.*;

public class GestoreFileNIO2 implements GestoreSerializzazione<Contatto> {
    
    @Override
    public void inserisci(Contatto contatto) throws ContattoEsistenteException, FileNotFoundException, IOException {
        Path path = Paths.get(FileUtils.getNomeFile(contatto.getNome()));
        if (Files.exists(path)) {
            throw new ContattoEsistenteException(contatto.getNome() +": contatto già esistente!");
        }
        registra(contatto);
    }

    @Override
    public Contatto recupera(String nome) throws ContattoInesistenteException, ContattoEsistenteException {
        Contatto contatto = getContatto(FileUtils.getNomeFile(nome));
        if (contatto == null) {
            throw new ContattoInesistenteException(nome +": contatto non trovato!");
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
        Path path = Paths.get(FileUtils.getNomeFile(nome));
        if (Files.exists(path)) {
            Files.delete(path);
        } else {
            throw new ContattoInesistenteException(nome +": contatto non trovato!");
        }
    }

    private void registra(Contatto contatto) throws  FileNotFoundException, IOException {
        Path path = Paths.get(FileUtils.getNomeFile(contatto.getNome()));
        Files.write(path, getBytesDaOggetto(contatto));
    }

    private byte[] getBytesDaOggetto(Object object) throws IOException {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = new ObjectOutputStream(bos)) {
            out.writeObject(object);
            return bos.toByteArray();
        }
    }

    private Object getOggettoDaByte(byte[] bytes) throws IOException, ClassNotFoundException {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInput in = new ObjectInputStream(bis)) {
            return in.readObject();
        }
    }


    private boolean isContattoEsistente(String nome) {
        Path path = Paths.get(FileUtils.getNomeFile(nome));
        return Files.exists(path);
    }

    private Contatto getContatto(String nome) {
        Path path = Paths.get(nome);
        byte[] bytes = null;
        Contatto contatto = null;
        try {
            bytes = Files.readAllBytes(path);
            contatto = (Contatto)getOggettoDaByte(bytes);
        }
        catch (Exception exc) {
            return null;
        }
        return contatto;
    }
}