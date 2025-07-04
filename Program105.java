
class MyQueue {
// This class implements a queue using an array

    int front, rear, size;
    int capacity;
    int[] arr;

    MyQueue(int capacity) {
        this.capacity = capacity;
        front = 0;
        size = 0;
        rear = capacity - 1;
        arr = new int[capacity];
    }

    void enqueue(int item) {
        if (isFull()) {
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int peek() {
        return arr[front];
    }
}

public class Program105 {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek()); // 10

        System.out.println("Removed: " + queue.dequeue()); // 10
        System.out.println("Is queue empty? " + queue.isEmpty()); // false
    }
}
