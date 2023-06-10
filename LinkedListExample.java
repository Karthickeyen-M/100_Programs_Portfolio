import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> names = new LinkedList<>();

        // Adding elements to the LinkedList
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        // Accessing elements using index
        System.out.println("Element at index 1: " + names.get(1));

        // Iterating over the LinkedList
        System.out.println("Elements in the LinkedList:");
        for (String name : names) {
            System.out.println(name);
        }

        // Checking if an element exists
        boolean containsAlice = names.contains("Alice");
        System.out.println("LinkedList contains Alice: " + containsAlice);

        // Removing an element
        names.remove("Bob");

        // Size of the LinkedList
        System.out.println("Size of the LinkedList: " + names.size());
    }
}
