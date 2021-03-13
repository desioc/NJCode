package com.claudiodesio.jaxb;

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

    private static final String PLAYLIST_FILE = "playlist_con_jaxb.xml";

    public static void main(String[] args) throws IOException, JAXBException {
        // creaimo una playlist
        Playlist playlist = getPlaylist();
        // creazione di un oggetto JAXBContext
        JAXBContext context = JAXBContext.newInstance(Playlist.class);
        //salviamo la playlist in un file XML
        salvaPlaylistSuXml(context, playlist);
        //rileggiamo il contenuto della playlist direttamente dal file
        leggiPlaylistDaFileXML(context);
    }

    private static void leggiPlaylistDaFileXML(JAXBContext context) throws FileNotFoundException, JAXBException {
        // creaiamo un oggetto unmarshaller per leggere dal file
        Unmarshaller unmarshaller = context.createUnmarshaller();
        //leggiamo la playlista dal file XML
        Playlist playlistLetta = (Playlist) unmarshaller.unmarshal(new FileReader(PLAYLIST_FILE));
        //Recuperiamo le canzoni e stampiamo 
        ArrayList<Song> songsLette = playlistLetta.getSongs();
        System.out.println("Contenuto della playlist letta dal file XML: ");
        for (Song song : songsLette) {
            System.out.println(song);
        }
    }

    private static void salvaPlaylistSuXml(JAXBContext context, Playlist playlist) throws JAXBException, PropertyException {
        //creiamo un oggetto Marshaller cper scrivere i un file.
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // Scriviamo la playlist nel file XML
        marshaller.marshal(playlist, new File(PLAYLIST_FILE));
        System.out.println("Salvato il seguente file XML:");
        // Istruzione che scrive il file sull'oggetto System.out
        marshaller.marshal(playlist, System.out);
    }

    private static Playlist getPlaylist() {
        ArrayList<Song> songs = getListaDiCanzoni();
        ////creazione di un oggetto Playlist
        Playlist playlist = new Playlist();
        playlist.setAuthor("Claudio De Sio");
        playlist.setSongs(songs);
        return playlist;
    }

    private static ArrayList<Song> getListaDiCanzoni() {
        // creaiamo un arraylist di oggetti song
        ArrayList<Song> songs = new ArrayList<>();
        //creazione della prima canzone
        Song song1 = new Song();
        song1.setTitle("The road of Bones");
        song1.setArtist("IQ");
        song1.setAlbum("The road of Bones");
        song1.setYear("2014");
        songs.add(song1);
        //creazione della seconda canzone
        Song song2 = new Song();
        song2.setTitle("In the passing light of day");
        song2.setArtist("Pain of salvation");
        song2.setAlbum("In the passing light of day");
        song2.setYear("2017");
        songs.add(song2);
        return songs;
    }
}
