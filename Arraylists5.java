import java.util.ArrayList;
import java.util.Collections;

public class Arraylists5 {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> names = new ArrayList<>();

        // Add elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Alice");

        // Count the occurrences of a specific element in the ArrayList
        int countAlice = Collections.frequency(names, "Alice");
        System.out.println("Occurrences of 'Alice': " + countAlice);

        // Reverse the order of elements in the ArrayList
        Collections.reverse(names);
        System.out.println("Reversed ArrayList: " + names);

        // Remove all occurrences of a specific element from the ArrayList
        names.removeAll(Collections.singleton("Alice"));
        System.out.println("ArrayList after removing all occurrences of 'Alice': " + names);

        // Create a sublist from the ArrayList
        ArrayList<String> sublist = new ArrayList<>(names.subList(0, 2));
        System.out.println("Sublist: " + sublist);
    }
}
