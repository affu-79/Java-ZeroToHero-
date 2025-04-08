
import java.util.Scanner;

public class Program36 {
// arrays program (4) [ taking an array as input from user  and find minimum and maximum value in the array. ]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];//array declared without initialization
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();//taking input from user
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];

            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);
        System.out.println("Minimum value in the array is: " + min);

    }
}
