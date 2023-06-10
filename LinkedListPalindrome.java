import java.util.LinkedList;

public class LinkedListPalindrome {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(1);

        // Check if the LinkedList is palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < linkedList.size() / 2; i++) {
            if (!linkedList.get(i).equals(linkedList.get(linkedList.size() - i - 1))) {
                isPalindrome = false;
                break;
            }
        }

        // Print the result
        if (isPalindrome) {
            System.out.println("LinkedList is palindrome.");
        } else {
            System.out.println("LinkedList is not palindrome.");
        }
    }
}
