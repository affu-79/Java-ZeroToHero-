
import java.util.Stack;
// this program demonstrates the use of a Stack in Java using the Stack class

public class Program98 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek()); // 30

        System.out.println("Removed: " + stack.pop()); // 30
        System.out.println("Is stack empty? " + stack.isEmpty()); // false
    }
}
