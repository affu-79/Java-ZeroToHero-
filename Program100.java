
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedListStack {

    Node top;

    void push(int data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    int pop() {
        if (top == null) {
            System.out.println("Underflow");
            return -1;
        }
        int result = top.data;
        top = top.next;
        return result;
    }

    int peek() {
        if (top == null) {
            return -1;
        }
        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }
}

public class Program100 {

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30

        System.out.println("Removed: " + stack.pop()); // 30
        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
