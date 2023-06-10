import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> scores = new HashMap<>();

        // Adding key-value pairs to the HashMap
        scores.put("John", 80);
        scores.put("Alice", 90);
        scores.put("Bob", 75);

        // Accessing values using keys
        System.out.println("Score of John: " + scores.get("John"));

        // Iterating over the HashMap
        System.out.println("Scores in the HashMap:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + ": " + score);
        }

        // Checking if a key exists
        boolean containsAlice = scores.containsKey("Alice");
        System.out.println("HashMap contains Alice: " + containsAlice);

        // Removing a key-value pair
        scores.remove("Bob");

        // Size of the HashMap
        System.out.println("Size of the HashMap: " + scores.size());
    }
}
