import java.util.LinkedList;

public class LinkedListReverse {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // Reverse the LinkedList
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (Integer element : linkedList) {
            reversedList.addFirst(element);
        }

        // Print the reversed LinkedList
        System.out.println("Reversed LinkedList: " + reversedList);
    }
}
