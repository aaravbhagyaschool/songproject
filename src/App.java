import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // Variable to store the songs
        ArrayList<Song> songs;

        // Import the songs from the CSV using the SongImporter
        songs = SongImporter.importSongsFromCSV("songs.csv");

        // Loop through all the songs imported
        for (Song song : songs) {
            // Print the song details
            System.out.println(song.toString());
        }
    }
}
