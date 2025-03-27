
public class Program16 {

    public static void main(String[] args) {
        //Pattern programming (Inverted Half Pyramid | Rotated 180 degrees)
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.err.println("");
        }
    }
}
