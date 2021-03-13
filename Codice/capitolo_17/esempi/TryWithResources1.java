import java .sql.*;
public class TryWithResources1 {
    public static void main(String args[]) {
        selectFromDB();
    }
    public static void selectFromDB() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;
        try {
            conn = DriverManager.getConnection("jdbc:derby:Music"/* , "username", "password" */);
            stmt = conn.createStatement();
            res = stmt.executeQuery("SELECT * FROM Album");
            while (res.next()) {
                System.out.printf("%s : %s (%s)\n", res.getString("Artist"), res.getString("Title"), res.getInt("Release_Year"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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