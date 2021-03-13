import java.sql.*;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.stream.*;
import java.nio.file.*;

public class DBGenerator {
    private Properties p;
    private static final String CONFIGURATION_FILE ="DBConfig.txt";
    private static final String SCRIPT_FILE ="DBScript.txt";

    public DBGenerator ( ) throws Exception {
        p = new Properties();
        try (InputStream fis = new FileInputStream(CONFIGURATION_FILE);) {
            p.load(fis);
            createDB();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    public void createDB() throws Exception {
        try (Connection conn = DriverManager.getConnection(p.getProperty("db.url"));
        Stream<String> stream = Files.lines(Paths.get(SCRIPT_FILE));
        Statement stmt = conn.createStatement()) {
            stream.forEach(line-> executeUpdate(stmt, line));
            System.out.println("Database created!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void executeUpdate(Statement stmt, String cmd) {
        try {
            stmt.executeUpdate(cmd);
        } catch (SQLException exc) {
            exc.printStackTrace();
        }
    }

    public static void main(String args[])  throws Exception {
        new DBGenerator();
    }
}