import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists6 {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Iterate over the elements using a while loop and an Iterator
        System.out.println("Elements in the ArrayList using while loop and Iterator:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }

        // Remove elements from the ArrayList using Iterator's remove() method
        iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }

        // Iterate over the modified ArrayList
        System.out.println("Elements in the modified ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
