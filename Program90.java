
class Program90 {
//Linked List - singly linked list

    Node head;
    private int size;

    public Program90() {
        this.size = 0;
    }

    class Node {

        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add element at first position
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add element at position
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        // traverse to the last node
        while (currNode.next != null) {
            currNode = currNode.next;

        }
        currNode.next = newNode;
    }

    // delete first element
    public void deleteFirst() {
        if (head == null) {
            // if list is empty
            System.out.println("List is empty");
            return;
        }
        // if list is not empty
        size--;
        head = head.next;
    }

    // delete last element
    public void deleteLast() {
        if (head == null) {
            // if list is empty
            System.out.println("List is empty");
            return;
        }
        // if list is not empty
        size--;
        if (head.next == null) {
            // if there is only one node
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        // traverse to the second last node
        while (lastNode.next != null) {
            secondLast = secondLast.next;
            lastNode = lastNode.next;// move to the last node
        }
        secondLast.next = null; // remove the last node
    }

    // print the linked list
    public void printList() {
        if (head == null) {
            // if list is empty
            System.out.println("List is empty");
            return;
        }
        // if list is not empty
        Node currNode = head;
        // traverse the list and print each node's data
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // get the size of the linked list
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Program90 list = new Program90();
        list.addFirst("a");           // add first element
        list.addFirst("is");
        list.printList();
        list.addLast("list");      // add last element
        list.addFirst("This");
        list.printList();
        list.deleteFirst();     // delete first element
        list.printList();
        list.deleteLast();    // delete last element
        list.printList();    // print the linked list
        System.out.println("Size of the linked list: " + list.getSize()); // get the size of the linked list
        list.addFirst("new");
        list.addLast("element");
        list.printList();
        System.out.println("Size of the linked list: " + list.getSize());

    }

}
