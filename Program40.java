
import java.util.Scanner;

public class Program40 {
// 2D arrays program (1)[for given matrix print the ranspose]

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
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }
}
