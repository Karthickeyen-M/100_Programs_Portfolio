import java.util.LinkedList;

public class LinkedListMiddleElement {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // Find the middle element
        int middleIndex = linkedList.size() / 2;
        int middleElement = linkedList.get(middleIndex);

        // Print the middle element
        System.out.println("Middle Element: " + middleElement);
    }
}
