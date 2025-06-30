
public class Program94 {

    // program to make a linked list & add the following elements to it:[  1, 5, 7, 3, 8, 2, 3].
    // And Search for the number 7 & display its index
    // Node class
    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // LinkedList class
    static class MyLinkedList {

        Node head;
        Node tail;

        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Print the list
        public void printList() {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("NULL");
        }

        // Search for an element and return index
        public int search(int key) {
            Node curr = head;
            int index = 0;
            while (curr != null) {
                if (curr.data == key) {
                    return index;
                }
                curr = curr.next;
                index++;
            }
            return -1; // not found
        }
    }

    // Main method
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // Add elements
        int[] elements = {1, 5, 7, 3, 8, 2, 3};
        for (int elem : elements) {
            list.addLast(elem);
        }

        // Print the list
        System.out.print("Linked List: ");
        list.printList();

        // Search for element 7
        int key = 7;
        int index = list.search(key);

        if (index != -1) {
            System.out.println("Element " + key + " found at index: " + index);
        } else {
            System.out.println("Element " + key + " not found in the list.");
        }
    }
}
