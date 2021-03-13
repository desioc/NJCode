import java .sql.*;
public class CRUDTest {
    public static void main(String args[]) {
         try (Connection conn = DriverManager.getConnection("jdbc:derby:Music");
                 Statement stmt = conn.createStatement())   {      
                 stampaResultSet(stmt);
            Album album = new Album(5,"Led Zeppelin", "Led Zeppelin IV", 1971);
            inserisciAlbum(stmt, album);
            stampaResultSet(stmt);
            album.setTitolo("Led Zeppelin III");
            aggiornaAlbum(stmt, album);
            stampaResultSet(stmt);
            eliminaAlbum(stmt, album);
            stampaResultSet(stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
    public static int inserisciAlbum(Statement stmt, Album album) throws SQLException  {
        String insertStatement = String.format("INSERT INTO ALBUM (AlbumId, Titolo, Artista, Anno) VALUES (%s,'%s','%s',%s)", album.getAlbumId(), album.getArtista(), album.getTitolo(), album.getAnno());
        System.out.println(insertStatement);
        return stmt.executeUpdate(insertStatement);
    }
   
    public static int aggiornaAlbum(Statement stmt, Album album) throws SQLException  {
        String updateStatement = String.format("UPDATE  ALBUM set Titolo='%s', Artista='%s', Anno=%s WHERE AlbumId = %s", album.getArtista(), album.getTitolo(), album.getAnno(), album.getAlbumId());
        System.out.println(updateStatement);
        return stmt.executeUpdate(updateStatement);
    }
    
     public static int eliminaAlbum(Statement stmt, Album album) throws SQLException  {
        String deleteStatement = String.format("DELETE FROM  ALBUM  WHERE AlbumId = %s", album.getAlbumId());
        System.out.println(deleteStatement);
        return stmt.executeUpdate(deleteStatement);
    }
    
    public static void stampaResultSet( Statement stmt) throws SQLException{
        try (ResultSet res = stmt.executeQuery("SELECT * FROM Album")) {
            while (res.next()) {
                System.out.printf("%s : %s (%s)\n", res.getString("Artista"), res.getString("Titolo"), res.getInt("Anno"));
            }
        }
    }
}