import java.util.LinkedList;

public class LinkedListMerge {
    public static void main(String[] args) {
        // Create the first LinkedList
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        // Create the second LinkedList
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        // Merge the two LinkedLists
        LinkedList<Integer> mergedList = new LinkedList<>(list1);
        mergedList.addAll(list2);

        // Print the merged LinkedList
        System.out.println("Merged LinkedList: " + mergedList);
    }
}
