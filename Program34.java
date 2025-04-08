
import java.util.Scanner;

public class Program34 {
// arrays program (2)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];//array declared without initialization
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();//taking input from user
        }
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
