import java .sql.*;
public class TryWithResources2 {
    public static void main(String args[]) {
        selectFromDB();
    }
    public static void selectFromDB() {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:Music");
        Statement stmt = conn.createStatement();
        ResultSet res = stmt.executeQuery("SELECT * FROM Album")) {
            while (res.next()) {
                System.out.printf("%s : %s (%s)\n", res.getString("Artist"), res.getString("Title"), res.getInt("Release_Year"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}