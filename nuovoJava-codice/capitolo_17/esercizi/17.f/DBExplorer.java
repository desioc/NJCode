import java.sql.*;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.stream.*;
import java.nio.file.*;

public class DBExplorer {
    private Properties p;
    private static final String CONFIGURATION_FILE ="DBConfig.txt";

    public DBExplorer ( ) throws Exception {
        p = new Properties();
        try (InputStream fis = new FileInputStream(CONFIGURATION_FILE);) {
            p.load(fis);
        } catch (IOException exc) {
            exc.printStackTrace();
        }
        printContacts();
    }

    private void printContacts() {
        try (Connection conn = DriverManager.getConnection(p.getProperty("db.url"));
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM CONTATTO")) {
            while (res.next()) {
                System.out.printf("%s\nTelefono: %s\nIndirizzo: %s\n\n", res.getString("NOME"), res.getString("TELEFONO"), res.getString("INDIRIZZO"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }

    public static void main(String args[])  throws Exception {
        new DBExplorer();
    }
}