
import java.util.Scanner;

public class Program57 {

    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println("Sum of numbers is " + sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number(i):");
        int i = sc.nextInt();
        System.out.println("Enter the ending number(n):");
        int n = sc.nextInt();
        int sum = 0;
        printSum(i, n, sum);

    }
}
