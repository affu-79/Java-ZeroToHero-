
public class Program13 {

    public static void main(String[] args) {
        //Pattern programming-2 (Hollow rectangle)

        int n = 4;
        int m = 5;
        //outer loop for rows
        for (int i = 1; i <= n; i++) {
            //inner loop for columns
            for (int j = 1; j <= m; j++) {
                //check if it is first row or last row or first column or last column

                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
