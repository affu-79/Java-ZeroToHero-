
import java.util.*;

public class Program31 {
//function to find if number is a even number or odd

    public static void isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even number");
        } else {
            System.out.println(num + " is odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        isEvenOrOdd(num);

    }

}
