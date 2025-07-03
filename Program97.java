
class Program97 {

// This program demonstrates how to reverse a singly linked list using Recursion.
    private int size;
    Node head;

    public Program97() {
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

    //reverse the linked list - Recursion
    public Node reverseRecursvive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRecursvive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        Program97 list = new Program97();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.head = list.reverseRecursvive(list.head);
        list.printList();
    }
}
