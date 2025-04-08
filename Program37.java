
import java.util.Scanner;

public class Program37 {
// arrays program (4) [ taking an array as input from user  and find if array is sorted in ascending order or not. ]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];//array declared without initialization
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();//taking input from user
        }
        boolean isAscending = true;
        for (int i = 0; i < (size - 1); i++) {
            if (numbers[i] < numbers[i + 1]) {
            } else {
                isAscending = false;
            }
        }
        if (isAscending) {
            System.out.println("Array is sorted in ascending order.");
        } else {
            System.out.println("Array is not sorted in ascending order.");
        }

    }
}
