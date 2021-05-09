public class Album {
    public Album (int albumId){
        this.albumId =albumId;
    }
    
    public Album (int albumId, String artist, String title, int releaseYear){
        this.albumId = albumId;
        this.artist = artist;
        this.title = title;
        this.releaseYear = releaseYear;
    }
    
    private String artist;
    private String title;
    private int releaseYear;
    private int albumId;

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getAlbumId() {
        return albumId;
    }


    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

        
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public String toString() {
        return "(" + albumId + ", " + artist +  ", " + title + ", " + releaseYear +")";
    }
}