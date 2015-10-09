package philipng.top10downloader;

/**
 * Created by Phil on 10/7/15.
 */
public class Application {
    private String name;
    private String artist;
    private String releaseDate;

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Artist: " + getArtist() + "\n" +
                "Release Date: " + getArtist() + "\n" ;
    }
}

