import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListRemoveDuplicates {
    public static void main(String[] args) {
        // Create a LinkedList with duplicates
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(1);

        // Use HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        LinkedList<Integer> uniqueList = new LinkedList<>();

        for (Integer element : linkedList) {
            if (set.add(element)) {
                uniqueList.add(element);
            }
        }

        // Print the LinkedList without duplicates
        System.out.println("LinkedList without Duplicates: " + uniqueList);
    }
}
