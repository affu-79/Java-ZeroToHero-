// This program implements a queue using a linked list

class Node {
// Represents a node in the linked list

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedListQueue {

    Node front, rear;

    void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (front == null) {
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return val;
    }

    int peek() {
        if (front == null) {
            return -1;
        }
        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }
}

public class Program106 {

    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.peek());    // 20
        System.out.println(queue.isEmpty()); // false
    }
}
