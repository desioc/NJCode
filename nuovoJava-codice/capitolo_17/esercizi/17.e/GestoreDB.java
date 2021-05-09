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
    public void modifica(Contatto contatto) throws ContattoInesistenteException, SQLException {

    }

    @Override
    public void rimuovi(String nome) throws ContattoInesistenteException, SQLException {

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