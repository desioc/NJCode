package rubrica.integrazione;

import java.util.*;
import rubrica.dati.*;
import rubrica.eccezioni.*;
import rubrica.util.*;
import java.util.stream.*;
import java.sql.*;

public class GestoreDB implements GestoreSerializzazione<Contatto> {
    private static final String URL ="jdbc:derby:Rubrica";

    @Override
    public void inserisci(Contatto contatto) throws ContattoEsistenteException, SQLException {
        try (Connection connection = DriverManager.getConnection (URL);
        Statement cmd = connection.createStatement();) {
            String insert ="INSERT INTO Contatto (Nome, Telefono, Email) "+
"VALUES ('"+ contatto.getNome() +"', '"+ contatto.getNumeroDiTelefono() +
"', '"+ contatto.getIndirizzo()+"')";
            int result = cmd.executeUpdate(insert);
        }
    }

    @Override
    public Contatto recupera(String nome) throws ContattoInesistenteException, ContattoEsistenteException {
        return null;
    }

    @Override
    public void modifica(Contatto contatto) throws ContattoInesistenteException, ContattoEsistenteException, SQLException {

    }

    @Override
    public void rimuovi(String nome) throws ContattoInesistenteException, ContattoEsistenteException, SQLException {

    }

    @Override
    public List<Contatto> getContatti() throws SQLException {
        return null;
    }
}