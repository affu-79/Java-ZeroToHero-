// program to implement a circular queue using an array

public class Program107 {

    // Array to store queue elements
    private int[] queue;

    // Pointers for front and rear
    private int front, rear;

    // Current size of queue and max capacity
    private int size, capacity;

    // Constructor to initialize the circular queue
    public Program107(int capacity) {
        this.capacity = capacity;         // set capacity
        queue = new int[capacity];        // create array of given size
        front = 0;                        // front starts at 0
        rear = -1;                        // rear is before first element
        size = 0;                         // initially size is 0
    }

    // Method to insert an element in the queue
    public void enqueue(int data) {
        if (isFull()) {                   // check if queue is full
            System.out.println("Queue is full. Cannot enqueue " + data);
            return;
        }

        // Circular increment of rear pointer
        rear = (rear + 1) % capacity;

        // Add the element at the new rear position
        queue[rear] = data;

        // Increase the size
        size++;
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {                  // check if queue is empty
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        // Get the front element to return later
        int result = queue[front];

        // Circular increment of front pointer
        front = (front + 1) % capacity;

        // Decrease the size
        size--;

        // Return the dequeued element
        return result;
    }

    // Method to get the front element without removing it
    public int peek() {
        if (isEmpty()) {                  // check if empty
            System.out.println("Queue is empty.");
            return -1;
        }

        // Return front element
        return queue[front];
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display all elements in the queue in order
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");
        // Loop through the queue using circular indexing
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;  // wrap around using modulo
            System.out.print(queue[index] + " ");
        }
        System.out.println();
    }

    // Main method to test the circular queue
    public static void main(String[] args) {
        // Create a queue of capacity 5
        Program107 cq = new Program107(5);

        // Enqueue 5 elements
        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.display(); // Output: 10 20 30 40 50

        // Remove 2 elements from the queue
        System.out.println("Dequeued: " + cq.dequeue()); // Removes 10
        System.out.println("Dequeued: " + cq.dequeue()); // Removes 20

        // Add 2 more elements
        cq.enqueue(60);
        cq.enqueue(70);
        cq.display(); // Output: 30 40 50 60 70 (circular)

        // Show the front element
        System.out.println("Front: " + cq.peek()); // Output: 30
    }
}
