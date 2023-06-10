import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists2 {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Check if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is ArrayList empty: " + isEmpty);

        // Sort the elements in the ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);

        // Get the index of an element in the ArrayList
        int index = fruits.indexOf("Banana");
        System.out.println("Index of 'Banana': " + index);

        // Remove an element by value
        boolean removed = fruits.remove("Orange");
        System.out.println("Element 'Orange' removed: " + removed);

        // Create a copy of the ArrayList
        ArrayList<String> fruitsCopy = new ArrayList<>(fruits);
        System.out.println("Copy of ArrayList: " + fruitsCopy);

        // Add all elements from one ArrayList to another
        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Pineapple");
        moreFruits.add("Grapes");
        moreFruits.addAll(fruits);
        System.out.println("Combined ArrayList: " + moreFruits);

        // Clear the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }
}
