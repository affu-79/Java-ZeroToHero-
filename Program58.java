
import java.util.Scanner;
//calculating factorial of a number n using recursion!

public class Program58 {

    public static int calcFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm = calcFactorial(n - 1);
        int fact_n = n * fact_nm;
        return fact_n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int n = sc.nextInt();
        int factorial = calcFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

}
