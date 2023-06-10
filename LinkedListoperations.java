import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Print the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Add an element at the beginning
        linkedList.addFirst("Mango");

        // Add an element at the end
        linkedList.addLast("Grapes");

        // Remove the first element
        linkedList.removeFirst();

        // Remove the last element
        linkedList.removeLast();

        // Print the modified LinkedList
        System.out.println("Modified LinkedList: " + linkedList);
    }
}
