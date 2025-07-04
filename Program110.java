
import java.util.Stack;
// Program to reverse a string using a stack

public class Program110 {

    // Function to reverse a string using a stack
    public static String reverse(String input) {
        // Create an empty stack of characters
        Stack<Character> stack = new Stack<>();


        /*
        Step: Push all characters from input string to stack
        Input: "hello world"
        Stack Contents after push:
        ['h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd']
        (Top of stack is 'd')
         */
        // Step 1: Push all characters of the string into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));  // Push each character
        }


        /*
        Step-by-step Pop and build reversed string:
        Initial Output: ""

        Pop 1st time:  Stack: [..., 'l'] → Popped: 'd' → Output: "d"
        Pop 2nd time:  Stack: [..., 'r'] → Popped: 'l' → Output: "dl"
        Pop 3rd time:  Stack: [..., 'o'] → Popped: 'r' → Output: "dlr"
        Pop 4th time:  Stack: [..., 'w'] → Popped: 'o' → Output: "dlro"
        Pop 5th time:  Stack: [..., ' '] → Popped: 'w' → Output: "dlrow"
        Pop 6th time:  Stack: [..., 'o'] → Popped: ' ' → Output: "dlrow "
        Pop 7th time:  Stack: [..., 'l'] → Popped: 'o' → Output: "dlrow o"
        Pop 8th time:  Stack: [..., 'l'] → Popped: 'l' → Output: "dlrow ol"
        Pop 9th time:  Stack: [..., 'e'] → Popped: 'l' → Output: "dlrow oll"
        Pop 10th time: Stack: [..., 'h'] → Popped: 'e' → Output: "dlrow olle"
        Pop 11th time: Stack: []         → Popped: 'h' → Output: "dlrow olleh"

        Final Output: "dlrow olleh"
         */
        // Step 2: Pop characters from stack and append to result
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());  // Pop from stack (LIFO)
        }

        // Return the reversed string
        return reversed.toString();
    }

    // Main method to test the function
    public static void main(String[] args) {
        String original = "hello world";
        String reversed = reverse(original);

        System.out.println("Original: " + original);   // Output: hello world
        System.out.println("Reversed: " + reversed);   // Output: dlrow olleh
    }
}
