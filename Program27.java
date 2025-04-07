
import java.util.*;

public class Program27 {
//function to add 2 numbers

    public static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = addition(a, b);
        System.out.println("sum of 2 numbers is=" + sum);
    }
}
