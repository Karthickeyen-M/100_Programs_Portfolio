import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryaManagement {
    public static void main(String[] args) {
        // Create a HashMap to store inventory items and their quantities
        Map<String, Integer> inventory = new HashMap<>();

        // Initialize the inventory with some items
        inventory.put("Apples", 10);
        inventory.put("Bananas", 15);
        inventory.put("Oranges", 20);

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Inventory management loop
        while (true) {
            // Print the inventory
            System.out.println("Current Inventory:");
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                String item = entry.getKey();
                int quantity = entry.getValue();
                System.out.println(item + ": " + quantity);
            }

            // Prompt the user for an action
            System.out.println("\nSelect an action:");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Update quantity");
            System.out.println("4. Exit");

            // Read the user's choice
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Perform the chosen action
            switch (choice) {
                case 1:
                    System.out.print("Enter the item name: ");
                    String newItem = scanner.nextLine();
                    System.out.print("Enter the quantity: ");
                    int newQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    inventory.put(newItem, newQuantity);
                    System.out.println("Item added successfully.");
                    break;
                case 2:
                    System.out.print("Enter the item name: ");
                    String itemToRemove = scanner.nextLine();
                    inventory.remove(itemToRemove);
                    System.out.println("Item removed successfully.");
                    break;
                case 3:
                    System.out.print("Enter the item name: ");
                    String itemToUpdate = scanner.nextLine();
                    System.out.print("Enter the new quantity: ");
                    int updatedQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    inventory.put(itemToUpdate, updatedQuantity);
                    System.out.println("Quantity updated successfully.");
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
