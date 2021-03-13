package it.nuovojava.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "song")
// optionally we can specify the order in which the fields will be written
// with the XmlType annotation that specifies the propOrder elemener:
@XmlType(propOrder = {"title", "artist", "album", "year"})
public class Song {

    private String title;
    private String artist;
    private String album;
    private String year;

    // we can change the name in the XML output by adding the annotation
    // XmlElement specifying a different nam
    @XmlElement(name = "title")
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