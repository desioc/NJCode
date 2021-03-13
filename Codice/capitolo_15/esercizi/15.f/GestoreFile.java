package rubrica.integrazione;

import java.util.*;
import java.io.*;
import rubrica.dati.*;
import rubrica.util.*;
public class GestoreFile {

    public void inserisci(Contatto contatto) throws IOException {
        try (FileOutputStream fos =
        new FileOutputStream (new File(FileUtils.getNomeFile(contatto.getNome())));
        ObjectOutputStream s = new ObjectOutputStream (fos);) {
            s.writeObject (contatto);
        }
    }

    public Contatto recupera(String nome) throws IOException, ClassNotFoundException {
        Contatto contatto = null;
        try (FileInputStream fis = new FileInputStream (new File(nome + FileUtils.SUFFIX));
        ObjectInputStream ois = new ObjectInputStream (fis);) {
            contatto = (Contatto)ois.readObject();
        }
        return contatto;
    }
}