import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusicList {
    public static void main(String[] args) {
        List<String> playlist = new ArrayList<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Music playlist management loop
        while (true) {
            // Prompt the user for an action
            System.out.println("Select an action:");
            System.out.println("1. Add a song to the playlist");
            System.out.println("2. Remove a song from the playlist");
            System.out.println("3. View the playlist");
            System.out.println("4. Exit");

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Perform the chosen action
            switch (choice) {
                case 1:
                    System.out.print("Enter the song name: ");
                    String song = scanner.nextLine();
                    playlist.add(song);
                    System.out.println("Song added to the playlist.");
                    break;
                case 2:
                    System.out.print("Enter the song name to remove: ");
                    String songToRemove = scanner.nextLine();
                    if (playlist.remove(songToRemove)) {
                        System.out.println("Song removed from the playlist.");
                    } else {
                        System.out.println("Song not found in the playlist.");
                    }
                    break;
                case 3:
                    System.out.println("Playlist:");
                    if (playlist.isEmpty()) {
                        System.out.println("The playlist is empty.");
                    } else {
                        for (String s : playlist) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Print a blank line for separation
            System.out.println();
            scanner.close();
        }
    }
}
