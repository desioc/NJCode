import java .sql.*;
public class TransactionExample {
    public static void main(String args[]) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby:Music");
            stmt = conn.createStatement();
            conn.setAutoCommit(false);
            stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (31, 'Ella in Berlin: Mack the Knife', 'Ella Fitzgerald', 1960)");
            System.out.println("Before commit");
            res = stmt.executeQuery("SELECT * FROM Album");
            while (res.next()) {
                System.out.printf("%s : %s (%s)\n", res.getString("Artist"), res.getString("Title"), res.getInt("Release_Year"));
            }
            stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (31, 'The Real Thing', 'Faith No More', 1989)");
            stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (32, 'Radiohead', 'Ok Computer',1997)");
            try {
                conn.commit();
                System.out.println("Commit Executed!");
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            try {
                conn.rollback();
                System.out.println("Rollback Executed!\n");
            }
            catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            if (res != null) {
                try {
                    res.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
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
        }

        try (Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM Album")) {
            conn.setAutoCommit(true);
            while (resultSet.next()) {
                System.out.printf("%s : %s (%s)\n", resultSet.getString("Artist"), resultSet.getString("Title"), resultSet.getInt("Release_Year"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                conn = null;
            }
        }
    }
}