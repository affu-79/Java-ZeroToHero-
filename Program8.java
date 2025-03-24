
import java.util.Scanner;

public class Program8 {

    //Printing the table of a given number using for loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ehter the number  for which the table is to be printed: ");
        int num = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + "*" + (i + 1) + "=" + (num * (1 + i)));
        }
    }
}
