/*
The Celebrity Problem is a famous stack-based interview problem.
Here's a complete explanation, approach using stack, Java code with comments, and complexity analysis — all placement-ready.

-->  Problem Statement:
In a party of n people, a celebrity is defined as someone who:
- Is known by everyone else, but
- Knows no one (not even themselves)

You're given a matrix M[][] of size n x n:
- M[i][j] == 1 → Person i knows person j
- M[i][j] == 0 → Person i does not know person j

Return the index of the celebrity, or -1 if there is no celebrity.

-->  Approach using Stack:

-> Key Observations:
- If A knows B, then A cannot be a celebrity.
- If A doesn't know B, then B cannot be a celebrity.

 -> Stack-Based Algorithm:
1. Push all n people into a stack.
2. Pop two people A and B.
3. If A knows B, A is not a celebrity; push B back.
4. If A doesn’t know B, B is not a celebrity; push A back.
5. Repeat until 1 candidate remains.
6. Verify that this person is a celebrity:
   - They don’t know anyone.
   - Everyone knows them.
 */

import java.util.Stack;

public class Program109 {

    // Sample matrix M[i][j] = 1 if person i knows person j
    static int[][] M = {
        {0, 1, 1},
        {0, 0, 1},
        {0, 0, 0}
    };

    // Returns true if person a knows person b
    static boolean knows(int a, int b) {
        return M[a][b] == 1;
    }

    // Function to find the celebrity
    static int findCelebrity(int n) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Push everyone to stack
        for (int i = 0; i < n; i++) {
            stack.push(i);
        }

        // Step 2: Eliminate non-celebrities
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();

            // If a knows b, then a is not a celebrity
            if (knows(a, b)) {
                stack.push(b);
            } else {
                // If a doesn't know b, then b is not a celebrity
                stack.push(a);
            }
        }

        // Step 3: Potential celebrity
        int candidate = stack.pop();

        // Step 4: Final verification
        for (int i = 0; i < n; i++) {
            if (i != candidate) {
                // candidate should not know i, and everyone should know candidate
                if (knows(candidate, i) || !knows(i, candidate)) {
                    return -1; // Not a celebrity
                }
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int n = M.length;
        int result = findCelebrity(n);

        if (result == -1) {
            System.out.println("No celebrity found");
        } else {
            System.out.println("Celebrity is person: " + result);
        }
    }
}
