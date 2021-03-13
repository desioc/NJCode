import java.sql.*;

public class JDBCApp {
    public static void main (String args[]) {
        try {
            // Carichiamo un driver per connetterci a Derby (superfluo per JDBC 4)
            /* String driver = "org.apache.derby.jdbc.EmbeddedDriver";
            Class.forName(driver); */
            // Creiamo la stringa di connessione
            String url = "jdbc:derby:Music";
            // Otteniamo una connessione con username e password
            Connection con = DriverManager.getConnection (url/* , "myUserName", "myPassword" */);
            // Creiamo un oggetto Statement per interrogare il db
            Statement cmd = con.createStatement ();
            // Eseguiamo una query e immagazziniamone i risultati
            // in un oggetto ResultSet
            String qry = "SELECT * FROM Album";
            ResultSet res = cmd.executeQuery(qry);
            // Stampiamone i risultati riga per riga
            while (res.next()) {
                System.out.printf("%s : %s (%s)\n", res.getString("Artist"), res.getString("Title"), res.getInt("Release_Year"));
            }
            res.close();
            cmd.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }  /* catch (ClassNotFoundException e) {
            e.printStackTrace();
        } */
    }
}