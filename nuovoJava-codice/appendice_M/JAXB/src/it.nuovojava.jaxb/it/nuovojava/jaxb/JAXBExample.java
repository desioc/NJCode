package it.nuovojava.jaxb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {

    private static final String PLAYLIST_FILE = "playlist_with_jaxb.xml";

    public static void main(String[] args) throws IOException, JAXBException {
        // create a playlist
        Playlist playlist = getPlaylist();
        // create a JAXBContext object
        JAXBContext context = JAXBContext.newInstance(Playlist.class);
        //save the playlist in a XML file
        salvaPlaylistSuXml(context, playlist);
        //reread the playlist content directly from the file
        leggiPlaylistDaFileXML(context);
    }

    private static void leggiPlaylistDaFileXML(JAXBContext context) throws FileNotFoundException, JAXBException {
        // ceate aunmarshaller object to read fomr the file
        Unmarshaller unmarshaller = context.createUnmarshaller();
        //read the playlist from the XML file.
        Playlist readPlaylist = (Playlist) unmarshaller.unmarshal(new FileReader(PLAYLIST_FILE));
        //retrieve  the songs and print them
        ArrayList<Song> readSongs= readPlaylist.getSongs();
        System.out.println("Playlist content read from the XML file: ");
        for (Song song : readSongs) {
            System.out.println(song);
        }
    }

    private static void salvaPlaylistSuXml(JAXBContext context, Playlist playlist) throws JAXBException, PropertyException {
        /// create a Marshaller object to write a file.
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        //let's revisit the playlist in the XML file
        marshaller.marshal(playlist, new File(PLAYLIST_FILE));
        System.out.println("The following XML file has been saved:");
        // instruction that writes the file to the System.out object
        marshaller.marshal(playlist, System.out);
    }

    private static Playlist getPlaylist() {
        ArrayList<Song> songs = getSongsList();
        //playlist object creation
        Playlist playlist = new Playlist();
        playlist.setAuthor("Claudio De Sio");
        playlist.setSongs(songs);
        return playlist;
    }

    private static ArrayList<Song> getSongsList() {
        //create an arraylist of song objects
        ArrayList<Song> songs = new ArrayList<>();
        //first song creation
        Song song1 = new Song();
        song1.setTitle("The road of Bones");
        song1.setArtist("IQ");
        song1.setAlbum("The road of Bones");
        song1.setYear("2014");
        songs.add(song1);
         //second song creation
        Song song2 = new Song();
        song2.setTitle("In the passing light of day");
        song2.setArtist("Pain of salvation");
        song2.setAlbum("In the passing light of day");
        song2.setYear("2017");
        songs.add(song2);
        return songs;
    }
}