
class Program96 {

// This program demonstrates how to reverse a singly linked list using iteration.
    private int size;
    Node head;

    public Program96() {
        this.size = 0;
    }

    class Node {

        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    //add at last

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

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

    public int getSize() {

        return size;
    }

    //reverse the linked list - iterartion
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return; // No need to reverse if list is empty or has only one node
        }
        Node perv = head;
        Node curr = head.next;

        while (curr != null) {
            Node next = curr.next;
            //update the next pointer of the current node
            curr.next = perv; // reverse the link
            perv = curr; // move perv to current
            curr = next; // move to next node
        }
        head.next = null; // set the next of the old head to null
        head = perv; // update head to the new first node

    }

    public static void main(String[] args) {
        Program96 list = new Program96();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.reverseIterate();
        list.printList();
    }
}
