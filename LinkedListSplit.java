import java.util.LinkedList;

public class LinkedListSplit {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        // Split the LinkedList into two halves
        LinkedList<Integer> firstHalf = new LinkedList<>();
        LinkedList<Integer> secondHalf = new LinkedList<>();

        int middleIndex = linkedList.size() / 2;
        for (int i = 0; i < middleIndex; i++) {
            firstHalf.add(linkedList.get(i));
        }

        for (int i = middleIndex; i < linkedList.size(); i++) {
            secondHalf.add(linkedList.get(i));
        }

        // Print the two halves of the LinkedList
        System.out.println("First Half: " + firstHalf);
        System.out.println("Second Half: " + secondHalf);
    }
}
