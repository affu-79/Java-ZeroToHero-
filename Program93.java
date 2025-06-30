
class Program93 {
//remove nth-node from end of linked list

    public class Node {
// Node class to represent each element in the linked list

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    // LinkedList class to manage the linked list operations

    public class LinkedList {

        Node head;

        public LinkedList() {
            this.head = null;
        }

        // Function to remove the nth node from the end of the linked list
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {// If the list is empty, set the new node as head
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {// Traverse to the last node
                    current = current.next;
                }
                current.next = newNode;// Link the new node at the end of the list
            }
        }

        // Function to remove the nth node from the end of the linked list
        public void removeNthFromEnd(int n) {
            Node dummy = new Node(0);
            // Link dummy node to the head of the list
            dummy.next = head;
            Node first = dummy;
            Node second = dummy;

            for (int i = 0; i <= n; i++) {// Move the first pointer n+1 steps ahead
                first = first.next;
            }

            while (first != null) {// Move both pointers until the first pointer reaches the end
                first = first.next;
                second = second.next;
            }

            second.next = second.next.next;// Skip the nth node from the end
            head = dummy.next;
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("NULL");
        }

    }

    public static void main(String[] args) {
        Program93 list = new Program93();
        LinkedList linkedList = list.new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original List:");
        linkedList.printList();

        int n = 2; // Remove 2nd node from the end
        linkedList.removeNthFromEnd(n);// Call the method to remove the nth node from the end

        System.out.println("After removing " + n + "th node from the end:");
        linkedList.printList();
    }

}
