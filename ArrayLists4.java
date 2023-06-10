import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists4 {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Get the maximum element in the ArrayList
        int max = Collections.max(numbers);
        System.out.println("Maximum element: " + max);

        // Get the minimum element in the ArrayList
        int min = Collections.min(numbers);
        System.out.println("Minimum element: " + min);

        // Check if the ArrayList contains all elements of another ArrayList
        ArrayList<Integer> checkNumbers = new ArrayList<>();
        checkNumbers.add(30);
        checkNumbers.add(40);
        boolean containsAll = numbers.containsAll(checkNumbers);
        System.out.println("ArrayList contains all elements of checkNumbers: " + containsAll);

        // Convert the ArrayList to an array
        Integer[] numberArray = numbers.toArray(new Integer[0]);
        System.out.println("Array converted from ArrayList:");
        for (Integer num : numberArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
