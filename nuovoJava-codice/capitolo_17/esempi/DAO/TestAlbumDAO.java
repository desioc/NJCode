import java.util.*;

public class TestAlbumDAO {
    private final static int ID = 100;
    public static void main(String args[]) {
        DAO<Album> dao = new AlbumDAO();
        List<Album> albums = dao.selectAll();
        System.out.println("Situazione iniziale database:");
        for (Album album : albums) {
            System.out.println("Album: " + album);
        }
        Album album = new Album(ID, "Jazz" , "Queen" , 1979);
        dao.insert(album); 
        System.out.println("Album inserito");
        stampaAlbum(ID, dao.selectById(ID));
        dao.update(new Album(ID, "Jazz" , "Queen" , 1978));
        System.out.println("Album aggiornato");
        stampaAlbum(ID, dao.selectById(ID));
        dao.delete(new Album(ID, null , null , 0));
        Optional<Album> albumCancellato = dao.selectById(ID);
        System.out.println("Album cancellato!");
        stampaAlbum(ID, dao.selectById(ID));
    }

    private static void stampaAlbum(int id, Optional<Album> optionalAlbum) {
        if (optionalAlbum.isEmpty() ) {
            System.out.println("Nessun album trovato con id = " + id);
        } else {
            System.out.println("Album trovato con id = " + id + ":\n" +optionalAlbum.get());
        }
    }
}