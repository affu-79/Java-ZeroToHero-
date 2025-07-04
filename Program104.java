
import java.util.*;

public class Program104 {
// Using PriorityQueue to implement a Min Heap

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // Min Heap

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println(pq.poll()); // 10 (smallest)
    }
}
