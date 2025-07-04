// program to implement a queue using two stacks

import java.util.Stack;

public class Program108 {

    Stack<Integer> stack1; // Used for enqueue operations
    Stack<Integer> stack2; // Used for dequeue operations

    public Program108() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Enqueue (add) element to the end of the queue
    public void enqueue(int x) {
        stack1.push(x);  // Always push to stack1
    }

    // Dequeue (remove) element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        // If stack2 is empty, transfer all elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop()); // reverse stack1 into stack2
            }
        }

        return stack2.pop(); // Pop from stack2, which is the front of the queue
    }

    // Peek (get front element without removing)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop()); // make sure oldest element is on top
            }
        }

        return stack2.peek();
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Display the queue content (for understanding, not required in real implementation)
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        // Transfer to temp stack for display
        Stack<Integer> temp = new Stack<>();

        // If elements are in stack2, display from top to bottom
        if (!stack2.isEmpty()) {
            for (int i = stack2.size() - 1; i >= 0; i--) {
                System.out.print(stack2.get(i) + " ");
            }
        }

        // If elements are in stack1, display in insertion order (bottom to top)
        if (!stack1.isEmpty()) {
            for (int i = 0; i < stack1.size(); i++) {
                System.out.print(stack1.get(i) + " ");
            }
        }

        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        Program108 q = new Program108();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display(); // Output: 10 20 30

        System.out.println("Dequeued: " + q.dequeue()); // Output: 10
        q.display(); // Output: 20 30

        q.enqueue(40);
        q.enqueue(50);
        q.display(); // Output: 20 30 40 50

        System.out.println("Front: " + q.peek()); // Output: 20
    }
}
