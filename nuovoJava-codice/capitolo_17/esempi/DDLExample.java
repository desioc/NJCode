import java .sql.*;
public class DDLExample {
    public static void main(String args[]) {
        createDB();
    }
    public static void createDB() {
        try (Connection conn = DriverManager.getConnection("jdbc:derby:Music;create=true");
        Statement stmt = conn.createStatement();) {
            stmt.executeUpdate("CREATE TABLE Album ( AlbumId INT, Title VARCHAR(255), Artist VARCHAR(255), Release_Year INT, PRIMARY KEY (AlbumId))");
            stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (1, 'Made In Japan','Deep Purple',1972)");
            stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (2, 'Be','Pain Of Salvation',2004)");
            stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (3, 'Images And Words','Dream Theater',1992)");
            stmt.executeUpdate("INSERT INTO Album (AlbumId, Title, Artist, Release_Year) VALUES (4, 'The Human Equation','Ayreon',2004)");
            System.out.println("Database created!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}