import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayLists7 {
    public static void main(String[] args) {
        // Create an ArrayList to store strings
        ArrayList<String> colors = new ArrayList<>();

        // Add elements to the ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");

        // Iterate over the elements using a ListIterator in reverse order
        System.out.println("Elements in the ArrayList using ListIterator in reverse order:");
        ListIterator<String> listIterator = colors.listIterator(colors.size());
        while (listIterator.hasPrevious()) {
            String color = listIterator.previous();
            System.out.println(color);
        }

        // Replace elements in the ArrayList using ListIterator's set() method
        listIterator = colors.listIterator();
        while (listIterator.hasNext()) {
            String color = listIterator.next();
            if (color.equals("Red")) {
                listIterator.set("Pink");
            }
        }

        // Iterate over the modified ArrayList
        System.out.println("Elements in the modified ArrayList:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
