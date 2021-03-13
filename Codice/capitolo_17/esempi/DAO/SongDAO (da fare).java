import java.sql.*;
import java.util.*;

public class SongDAO implements DAO<Song> {
    public Optional<Song> selectById(long id) {
        Optional<Song> result = null;
        try (Connection connection = DriverManager.getConnection(URL);
        Statement cmd = connection.createStatement();
        ResultSet rs = cmd.executeQuery("SELECT * FROM SONG WHERE SONGID = " + id);) {
            Song song = null;
            if (rs.next()) {
                song = getSong(rs);
            }
            result = Optional.ofNullable(song);
        } catch (SQLException exc) {
            throw new DBException("SongDAO.selectByID" , exc);
        }
        return result;
    }

    public List<Song> selectAll() {
        List<Song> songs = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL);
        Statement cmd = connection.createStatement();
        ResultSet rs = cmd.executeQuery("SELECT * FROM SONG");) {
            Song song = null;
            while (rs.next()) {
                song = getSong(rs);
                songs.add(song);
            }
        } catch (SQLException exc) {
            throw new DBException("SongDAO.selectAll" , exc);
        }
        return songs;
    }

    public void insert(Song song) {
        try (Connection connection = DriverManager.getConnection(URL);
        PreparedStatement cmd = connection.prepareStatement("INSERT INTO SONG VALUES (?,?,?,?)");) {
            cmd.setInt(1, song.id());
            cmd.setString(2, song.title());
            cmd.setString(3, song.artist());
            cmd.setInt(4, song.year());
            cmd.executeUpdate();
        } catch (SQLException exc) {
            throw new DBException("SongDAO.insert" , exc);
        }
    }

    public void update(Song song) {
        try (Connection connection = DriverManager.getConnection(URL);
        Statement cmd = connection.createStatement();) {
            cmd.executeUpdate(String.format(
                "UPDATE SONG SET TITLE = %s, Artist = %s, RELEASE_YEAR = %d WHERE SONGID = %d" ,
                cmd.enquoteLiteral(song.title()),
                cmd.enquoteLiteral(song.artist()),
                song.year(),
                song.id()));
        } catch (SQLException exc) {
            throw new DBException("SongDAO.update" , exc);
        }
    }

    public void delete(Song song) {
        try (Connection connection = DriverManager.getConnection(URL);
        Statement cmd = connection.createStatement();) {
            cmd.executeUpdate(String.format(
                "DELETE FROM SONG WHERE SONGID = %d" ,
                song.id()));
        } catch (SQLException exc) {
            throw new DBException("SongDAO.delete" , exc);
        }
    }

    private Song getSong(ResultSet rs) throws SQLException {
        return new Song(rs.getInt("SongID"), rs.getString("Title"), rs.getString("Artist"), rs.getInt("Release_Year"));
    }
}