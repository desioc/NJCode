import java .sql.*;
public class SavepointExample {
    public static void main(String args[]) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby:Music");
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            Savepoint bluesSavepoint = conn.setSavepoint("BLUES");
            System.out.println("Savepoint with name "+ bluesSavepoint.getSavepointName() +" created");
            System.out.println("Try to add some blues...");
            stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (100, 'Willie Dixon', 'I Am The Blues', 1970)");
            try {
                conn.rollback(bluesSavepoint);
                System.out.println("Rollback Executed for "+ bluesSavepoint.getSavepointName() +" Savepoint");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            Savepoint savepoint = conn.setSavepoint();
            System.out.println("Savepoint with id "+ savepoint.getSavepointId() + " created");
            System.out.println("Try to add some soft rock...");
            stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (101, 'Tapestry', 'Carole King', 1971)");
            try {
                conn.commit();
                System.out.println("Commit Executed!");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            System.out.println("New records after commit:");
            res = stmt.executeQuery("SELECT * FROM Album WHERE AlbumId > 99");
            while (res.next()) {
                System.out.printf("%s : %s (%s)\n", res.getString("Artist"), res.getString("Title"), res.getInt("Release_Year"));
            }
        } catch (SQLException e) {
            try {
                conn.rollback();
                System.out.println("Rollback Executed!\n");
                e.printStackTrace();
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            //Delete new record to reset the database
            try {
                conn.setAutoCommit (true);
                stmt.executeUpdate("DELETE FROM Album WHERE AlbumId = 101");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            res = null;
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            stmt = null;
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                conn = null;
            }
        }
    }
}