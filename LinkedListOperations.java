import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Search for an element
        String searchElement = "Banana";
        int index = linkedList.indexOf(searchElement);
        if (index != -1) {
            System.out.println("Element '" + searchElement + "' found at index: " + index);
        } else {
            System.out.println("Element '" + searchElement + "' not found.");
        }

        // Reverse the LinkedList
        LinkedList<String> reversedList = new LinkedList<>();
        for (String element : linkedList) {
            reversedList.addFirst(element);
        }

        // Print the reversed LinkedList
        System.out.println("Reversed LinkedList: " + reversedList);
    }
}
