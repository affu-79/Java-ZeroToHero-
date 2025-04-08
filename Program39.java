
import java.util.Scanner;

public class Program39 {
// 2D arrays program (2)[take a matrix as input from user.search for a given number x and print the indeces at which it occurs .]

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int numbers[][] = new int[row][col];//array declared without initialization
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                numbers[i][j] = sc.nextInt();

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(numbers[i][j] + " ");

            }
            System.out.println();
        }
        int x = sc.nextInt();
        // number to be searched
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("Number found at index: (" + i + "," + j + ")");
                }
            }
        }

    }
}
