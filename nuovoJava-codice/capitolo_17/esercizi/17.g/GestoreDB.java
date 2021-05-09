package rubrica.integrazione;

import java.util.*;
import rubrica.dati.*;
import rubrica.eccezioni.*;
import rubrica.util.*;
import java.sql.*;
import java.io.*;

public class GestoreDB implements GestoreSerializzazione<Contatto> {
    private Properties p;
    private static final String CONFIGURATION_FILE ="DBConfig.txt";
    
    public GestoreDB() {
        p = new Properties();
        try (InputStream fis = new FileInputStream(CONFIGURATION_FILE);) {
            p.load(fis);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    @Override
    public void inserisci(Contatto contatto) throws ContattoEsistenteException, SQLException {
        try (Connection connection = DriverManager.getConnection(p.getProperty("db.url"));
        Statement cmd = connection.createStatement();) {
            String insert ="INSERT INTO CONTATTO (NOME, TELEFONO, INDIRIZZO) "+
                "VALUES ('"+ contatto.getNome() +"', '"+ contatto.getNumeroDiTelefono() +
                "', '"+ contatto.getIndirizzo()+"')";
            int result = cmd.executeUpdate(insert);
        } catch (SQLException e) {
            throw new ContattoEsistenteException("Contatto già presente");
        }
    }

    @Override
    public Contatto recupera(String nome) throws ContattoInesistenteException {
         Contatto contatto = null;
         try (Connection conn = DriverManager.getConnection(p.getProperty("db.url"));
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM CONTATTO WHERE NOME = '" + nome + "'")) {
            if (res.next()) {
                contatto = new Contatto(res.getString("NOME"), res.getString("TELEFONO"), res.getString("INDIRIZZO"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NomeVuotoException e) {
            throw new ContattoInesistenteException("Non esistono contatti senza nome");
        }
        return contatto;
    }

    @Override
    public void modifica(Contatto contatto) throws ContattoInesistenteException, ContattoEsistenteException, SQLException {
       try (Connection conn = DriverManager.getConnection(p.getProperty("db.url"));
        Statement cmd = conn.createStatement();) {
            String update = String.format(
            "UPDATE CONTATTO SET TELEFONO = '%s', INDIRIZZO = '%s' WHERE NOME = '%s'",
            contatto.getNumeroDiTelefono(), contatto.getIndirizzo(), contatto.getNome());
            int result = cmd.executeUpdate(update);
            if (result == 0) {
                throw new ContattoInesistenteException("Non esiste un contatto con nome " + contatto.getNome());
            }
        }
    }

    @Override
    public void rimuovi(String nome) throws ContattoInesistenteException, ContattoEsistenteException, SQLException {

    }

    @Override
    public List<Contatto> getContatti() throws Exception {
        List<Contatto> contatti = new ArrayList<Contatto>();
         try (Connection conn = DriverManager.getConnection(p.getProperty("db.url"));
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM CONTATTO")) {
            while (res.next()) {
                contatti.add(new Contatto(res.getString("NOME"), res.getString("TELEFONO"), res.getString("INDIRIZZO")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return contatti;
    }
}