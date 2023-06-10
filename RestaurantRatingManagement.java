import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantRatingManagement {
    public static void main(String[] args) {
        // Create a HashMap to store restaurant ratings
        Map<String, Integer> restaurantRatings = new HashMap<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Restaurant rating management loop
        while (true) {
            // Prompt the user for an action
            System.out.println("Select an action:");
            System.out.println("1. Add restaurant rating");
            System.out.println("2. Remove restaurant rating");
            System.out.println("3. Update restaurant rating");
            System.out.println("4. View restaurant ratings");
            System.out.println("5. Exit");

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Perform the chosen action
            switch (choice) {
                case 1:
                    System.out.print("Enter the restaurant name: ");
                    String restaurantName = scanner.nextLine();
                    System.out.print("Enter the restaurant rating (1-5): ");
                    int rating = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    restaurantRatings.put(restaurantName, rating);
                    System.out.println("Restaurant rating added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the restaurant name to remove: ");
                    String restaurantToRemove = scanner.nextLine();
                    restaurantRatings.remove(restaurantToRemove);
                    System.out.println("Restaurant rating removed successfully.");
                    break;
                case 3:
                    System.out.print("Enter the restaurant name to update: ");
                    String restaurantToUpdate = scanner.nextLine();
                    if (restaurantRatings.containsKey(restaurantToUpdate)) {
                        System.out.print("Enter the new restaurant rating: ");
                        int updatedRating = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        restaurantRatings.put(restaurantToUpdate, updatedRating);
                        System.out.println("Restaurant rating updated successfully.");
                    } else {
                        System.out.println("Restaurant rating not found.");
                    }
                    break;
                case 4:
                    System.out.println("Restaurant Ratings:");
                    for (Map.Entry<String, Integer> entry : restaurantRatings.entrySet()) {
                        String restaurant = entry.getKey();
                        int restaurantRating = entry.getValue();
                        System.out.println(restaurant + ": " + restaurantRating);
                    }
                    break;
                case 5:
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
