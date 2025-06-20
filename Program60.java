

public class Program60 {

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1; // Base case: x^0 = 1
        }
        if (x == 0) {
            return 0; // If x is 0, x^n is 0 for n > 0
        }
        int xPownm1 = calcPower(x, n - 1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int result = calcPower(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }
}
