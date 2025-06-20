
public class Program62 {
// Tower of Hanoi problem using recursion

    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Move disk " + n + " from " + src + " to " + dest);
            return;
        }
        // Move the first n-1 disks from source to helper
        towerOfHanoi(n - 1, src, dest, helper);
        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + src + " to " + dest);
        // Move the n-1 disks from helper to destination
        towerOfHanoi(n - 1, helper, src, dest);

    }
// time complexity: O(2^n)

    public static void main(String[] args) {
        int n = 2; // Number of disks
        towerOfHanoi(n, "src", "helper", "dest");
    }
}
