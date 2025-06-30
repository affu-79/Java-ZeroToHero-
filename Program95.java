
import java.util.Scanner;

// Program to  to take elements( numbers in the range 1-50) of a linked list as input from the user.
// delete all nodes which have values greater than 25.
public class Program95 {

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

        Node head, tail;

        // O(1) insert using tail pointer
        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Delete nodes with data > 25
        public void deleteGreaterThan25() {
            // Dummy node to simplify head deletions
            Node dummy = new Node(0);
            dummy.next = head;
            Node prev = dummy, curr = head;

            while (curr != null) {
                if (curr.data > 25) {
                    prev.next = curr.next;
                    if (curr == tail) {
                        tail = prev; // update tail if needed

                    }
                } else {
                    prev = curr;
                }
                curr = curr.next;
            }

            head = dummy.next;
        }

        // Print the list
        public void printList() {
            if (head == null) {
                System.out.println("List is empty.");
                return;
            }
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("NULL");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyLinkedList list = new MyLinkedList();

        System.out.println("Enter numbers between 1 and 50 (-1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == -1) {
                break;
            }
            if (val >= 1 && val <= 50) {
                list.addLast(val);
            } else {
                System.out.println("Invalid input. Enter number between 1 and 50.");
            }
        }

        System.out.print("Original list: ");
        list.printList();

        list.deleteGreaterThan25();

        System.out.print("List after deleting values > 25: ");
        list.printList();
    }
}
