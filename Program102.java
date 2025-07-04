
import java.util.*;

public class Program102 {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);  // enqueue
        q.offer(20);
        q.offer(30);

        System.out.println(q.poll());   // dequeue => 10
        System.out.println(q.peek());   // front => 20
        System.out.println(q.isEmpty()); // false
    }

}
