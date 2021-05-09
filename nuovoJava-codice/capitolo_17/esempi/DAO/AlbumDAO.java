import java.sql.*;
import java.util.*;

public class AlbumDAO implements DAO<Album> {
    public Optional<Album> selectById(long id) {
        Optional<Album> result = null;
        try (Connection connection = DriverManager.getConnection(URL);
        Statement cmd = connection.createStatement();
        ResultSet rs = cmd.executeQuery("SELECT * FROM ALBUM WHERE ALBUMID = " + id);) {
            Album album = null;
            if (rs.next()) {
                album = getAlbum(rs);
            }
            result = Optional.ofNullable(album);
        } catch (SQLException exc) {
            throw new DBException("AlbumDAO.selectByID" , exc);
        }
        return result;
    }

    public List<Album> selectAll() {
        List<Album> albums = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL);
        Statement cmd = connection.createStatement();
        ResultSet rs = cmd.executeQuery("SELECT * FROM ALBUM");) {
            Album album = null;
            while (rs.next()) {
                album = getAlbum(rs);
                albums.add(album);
            }
        } catch (SQLException exc) {
            throw new DBException("AlbumDAO.selectAll" , exc);
        }
        return albums;
    }

    public void insert(Album album) {
        try (Connection connection = DriverManager.getConnection(URL);
        PreparedStatement cmd = connection.prepareStatement("INSERT INTO ALBUM VALUES (?,?,?,?)");) {
            cmd.setInt(1, album.id());
            cmd.setString(2, album.title());
            cmd.setString(3, album.artist());
            cmd.setInt(4, album.year());
            cmd.executeUpdate();
        } catch (SQLException exc) {
            throw new DBException("AlbumDAO.insert" , exc);
        }
    }

    public void update(Album album) {
        try (Connection connection = DriverManager.getConnection(URL);
        Statement cmd = connection.createStatement();) {
            cmd.executeUpdate(String.format(
                "UPDATE ALBUM SET TITLE = %s, Artist = %s, RELEASE_YEAR = %d WHERE ALBUMID = %d" ,
                cmd.enquoteLiteral(album.title()),
                cmd.enquoteLiteral(album.artist()),
                album.year(),
                album.id()));
        } catch (SQLException exc) {
            throw new DBException("AlbumDAO.update" , exc);
        }
    }

    public void delete(Album album) {
        try (Connection connection = DriverManager.getConnection(URL);
        Statement cmd = connection.createStatement();) {
            cmd.executeUpdate(String.format(
                "DELETE FROM ALBUM WHERE ALBUMID = %d" ,
                album.id()));
        } catch (SQLException exc) {
            throw new DBException("AlbumDAO.delete" , exc);
        }
    }

    private Album getAlbum(ResultSet rs) throws SQLException {
        return new Album(rs.getInt("AlbumID"), rs.getString("Title"), rs.getString("Artist"), rs.getInt("Release_Year"));
    }
}