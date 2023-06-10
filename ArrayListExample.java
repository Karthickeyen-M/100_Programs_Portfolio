import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements using index
        System.out.println("Element at index 1: " + fruits.get(1));

        // Iterating over the ArrayList
        System.out.println("Elements in the ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if an element exists
        boolean containsMango = fruits.contains("Mango");
        System.out.println("ArrayList contains Mango: " + containsMango);

        // Removing an element
        fruits.remove("Banana");

        // Size of the ArrayList
        System.out.println("Size of the ArrayList: " + fruits.size());
    }
}
