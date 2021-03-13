import java .sql.*;
public class UpdatableResultSetExample {
    public static void main(String args[]) {
        selectFromDB();
    }
    public static void selectFromDB() {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:Music");
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet res = stmt.executeQuery("SELECT * FROM Album")) {
            System.out.println("Show table album contents before update:\n");
            while (res.next()) {
                System.out.printf("%s : %s (%s)\n", res.getString("Artist"), res.getString("Title"), res.getInt("Release_Year"));
            }
            res.absolute(28);
            res.updateString("Title","Passion & Warfare");
            res.updateRow();
            System.out.println("\nRow with AlbumId = 28 updated!\n");
            res.absolute(0);
            System.out.println("Show table album contents after update:\n");
            while (res.next()) {
                System.out.printf("%s : %s (%s)\n", res.getString("Artist"), res.getString("Title"), res.getInt("Release_Year"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}