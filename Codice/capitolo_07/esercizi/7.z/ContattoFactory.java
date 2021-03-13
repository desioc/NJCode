package rubrica.dati;

import rubrica.dati.Speciale;
import rubrica.dati.Contatto;

public class ContattoFactory {
    
    public static Contatto getContatto(String nome, String numeroDiTelefono,
            String indirizzo) {
        return new Contatto(nome, numeroDiTelefono, indirizzo);
    }

    public static Speciale getContatto(String nome, String numeroDiTelefono,
            String indirizzo, String suoneria) {
        return new Speciale(nome, numeroDiTelefono, indirizzo, suoneria);
    }
}