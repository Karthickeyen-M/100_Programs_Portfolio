class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> prev;
        private Node<T> next;

        Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAt(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }

        if (index == 0) {
            Node<T> newNode = new Node<>(element);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (index == size) {
            add(element);
        } else {
            Node<T> currentNode = getNodeAt(index);
            Node<T> newNode = new Node<>(element);
            newNode.prev = currentNode.prev;
            newNode.next = currentNode;
            currentNode.prev.next = newNode;
            currentNode.prev = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }

        Node<T> currentNode = getNodeAt(index);
        return currentNode.data;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of range.");
        }

        if (index == 0) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node<T> currentNode = getNodeAt(index);
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
        }
        size--;
    }

    public int size() {
        return size;
    }

    private Node<T> getNodeAt(int index) {
        Node<T> currentNode;
        if (index < size / 2) {
            currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = tail;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }
        return currentNode;
    }

    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.insertAt(1, "Mango");

        System.out.println("Elements in the Doubly Linked List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.removeAt(2);

        System.out.println("Elements after removing at index 2:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
