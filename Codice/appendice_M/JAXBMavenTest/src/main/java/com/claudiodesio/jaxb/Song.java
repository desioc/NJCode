package com.claudiodesio.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "song")
// opzionalmente possiamo specificare l'ordine in cui i campi verranno scritti 
// con l'annotazione XmlType che specifica l'elemento propOrder:
@XmlType(propOrder = {"title", "artist", "album", "year"})
public class Song {

    private String title;
    private String artist;
    private String album;
    private String year;

    // possiamo cambiare il nome nell'output XML aggiungendo l'annotazione
    // XmlElement er specificando un nome diverso
    @XmlElement(name = "titolo")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Canzone: " + "title=" + title + ", artist=" + artist + ", album=" + album + ", year=" + year;
    }

}
