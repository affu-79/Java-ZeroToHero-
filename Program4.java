
import java.util.*;
// finding if the user input number is even/odd/zero/not a number using if-else-if

public class Program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Its a even number");
        } else if (number % 2 == 1) {
            System.out.println("Its a odd number");
        } else if (number == 0) {
            System.out.println("The number is Zero '0' !");
        } else {
            System.out.println("Invalid number!");
        }

    }
}
