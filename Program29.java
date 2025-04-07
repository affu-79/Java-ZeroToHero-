
import java.util.*;

public class Program29 {
//function to find factorial of a number

    public static void fact(int num) {
        int factorial = 1;
        for (int i = num; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("factorial of " + num + " is :" + factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fact(num);

    }
}
