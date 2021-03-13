import java .sql.*;
public class InsertRowExample {
    public static void main(String args[]) {
        selectFromDB();
    }
    public static void selectFromDB() {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:Music");
        Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet res = stmt.executeQuery("SELECT * FROM Album")) {
            res.moveToInsertRow();
            res.updateString(1,"50");
            res.updateString("Title","London Calling");
            res.updateString("Artist","The Clash");
            res.updateInt(4, 1979);
            res.insertRow();
            res.moveToCurrentRow();
            System.out.println("\nAdded a row with 'insert row'");
            System.out.println("Show table album contents after update:\n");
            while (res.next()) {
                System.out.printf("%s : %s (%s)\n", res.getString("Artist"), res.getString("Title"), res.getInt("Release_Year"));
            }
            stmt.executeUpdate("DELETE FROM Album WHERE AlbumId = 50");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}