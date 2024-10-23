import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SongImporter {

    public static ArrayList<Song> importSongsFromCSV(String fileName) {
        ArrayList<Song> songs = new ArrayList<>();
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Skip the header row
            br.readLine();

            // Read each line from the CSV
            while ((line = br.readLine()) != null) {
                // Use comma as separator
                String[] songData = line.split(cvsSplitBy);

                // Ensure there are exactly 10 columns
                if (songData.length != 10) {
                    System.out.println("Skipping improperly formatted row: " + line);
                    continue;
                }

                try {
                    // Create a Song object with the 10 fields
                    Song song = new Song(songData[0].trim(), songData[1].trim(), songData[2].trim(), songData[3].trim(), 
                                         Integer.parseInt(songData[4].trim()), Double.parseDouble(songData[5].trim()), 
                                         Double.parseDouble(songData[6].trim()), Double.parseDouble(songData[7].trim()), 
                                         Double.parseDouble(songData[8].trim()), songData[9].trim());

                    // Add the song to the list
                    songs.add(song);
                } catch (NumberFormatException e) {
                    // Handle the case where numbers can't be parsed
                    System.out.println("Skipping row due to number format issue: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return songs;
    }
}
