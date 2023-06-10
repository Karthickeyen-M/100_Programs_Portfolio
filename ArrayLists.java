import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        // Access elements in the ArrayList
        System.out.println("Element at index 0: " + numbers.get(0));
        System.out.println("Element at index 2: " + numbers.get(2));

        // Update an element in the ArrayList
        numbers.set(1, 25);
        System.out.println("Updated element at index 1: " + numbers.get(1));

        // Remove an element from the ArrayList
        numbers.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + numbers);

        // Check if the ArrayList contains a specific element
        boolean contains = numbers.contains(30);
        System.out.println("ArrayList contains 30: " + contains);

        // Iterate over the elements in the ArrayList
        System.out.print("Elements in the ArrayList: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // Clear the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);
    }
}
