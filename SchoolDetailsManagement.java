import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SchoolDetailsManagement {
    public static void main(String[] args) {
        // Create a HashMap to store school details
        Map<String, String> schoolDetails = new HashMap<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // School details management loop
        while (true) {
            // Prompt the user for an action
            System.out.println("Select an action:");
            System.out.println("1. Add school detail");
            System.out.println("2. Remove school detail");
            System.out.println("3. Update school detail");
            System.out.println("4. View school details");
            System.out.println("5. Exit");

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Perform the chosen action
            switch (choice) {
                case 1:
                    System.out.print("Enter the detail key: ");
                    String key = scanner.nextLine();
                    System.out.print("Enter the detail value: ");
                    String value = scanner.nextLine();
                    schoolDetails.put(key, value);
                    System.out.println("School detail added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the detail key to remove: ");
                    String keyToRemove = scanner.nextLine();
                    schoolDetails.remove(keyToRemove);
                    System.out.println("School detail removed successfully.");
                    break;
                case 3:
                    System.out.print("Enter the detail key to update: ");
                    String keyToUpdate = scanner.nextLine();
                    if (schoolDetails.containsKey(keyToUpdate)) {
                        System.out.print("Enter the new value: ");
                        String updatedValue = scanner.nextLine();
                        schoolDetails.put(keyToUpdate, updatedValue);
                        System.out.println("School detail updated successfully.");
                    } else {
                        System.out.println("School detail not found.");
                    }
                    break;
                case 4:
                    System.out.println("School Details:");
                    for (Map.Entry<String, String> entry : schoolDetails.entrySet()) {
                        String keyDetail = entry.getKey();
                        String valueDetail = entry.getValue();
                        System.out.println(keyDetail + ": " + valueDetail);
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
