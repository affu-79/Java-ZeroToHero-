
import java.util.ArrayDeque;
import java.util.Deque;

public class Program101 {
// Using Deque to implement a stack

    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(100);
        stack.push(200);
        System.out.println(stack.pop()); // 200
        System.out.println(stack.peek()); // 100
    }
}
