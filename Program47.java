
import java.util.*;

public class Program47 {
//Write a program to find if a number is power of 2 or not

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Not a power of 2");
        } else if ((num & (num - 1)) == 0) {
            System.out.println("Power of 2");
        } else {
            System.out.println("Not a power of 2");
        }

    }

}
