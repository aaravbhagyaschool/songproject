public class Song {
    // Private instance variables for 10 columns
    private String artist;
    private String trackName;
    private String releaseDate;
    private String genre;
    private int length;
    private double shakeAudience;
    private double obscene;
    private double danceability;
    private double loudness;
    private String topic;

    // Constructor to initialize all 10 fields
    public Song(String artist, String trackName, String releaseDate, String genre, int length,
                double shakeAudience, double obscene, double danceability, double loudness, String topic) {
        this.artist = artist;
        this.trackName = trackName;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.length = length;
        this.shakeAudience = shakeAudience;
        this.obscene = obscene;
        this.danceability = danceability;
        this.loudness = loudness;
        this.topic = topic;
    }

    // Getters (not all shown for brevity)
    public String getArtist() {
        return artist;
    }

    public String getTrackName() {
        return trackName;
    }

    // Setters (not all shown for brevity)
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    // toString method for printing song details
    @Override
    public String toString() {
        return artist + " - " + trackName + " (" + releaseDate + "), Genre: " + genre + ", Length: " + length + "s";
    }
}
