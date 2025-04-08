
import java.util.Scanner;

public class Program35 {
// arrays program (3) [ taking an array as input from user search for given number x and point the index at which it occurs. ]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];//array declared without initialization
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();//taking input from user
        }
        int x = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("The number " + x + " is found at index " + i);
                break;
            }
        }
    }
}
