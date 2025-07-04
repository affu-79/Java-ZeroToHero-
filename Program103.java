
import java.util.*;

public class Program103 {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(1);
        q.offer(2);
        q.offer(3);

        System.out.println(q.poll());  // 1
        System.out.println(q.peek());  // 2
    }
}
