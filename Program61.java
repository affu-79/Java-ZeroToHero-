

public class Program61 {

    public static int calcPower(int x, int n) {
        if (n == 0) {
            return 1; // Base case: x^0 = 1
        }
        if (x == 0) {
            return 0; // If x is 0, x^n is 0 for n > 0
        }
        //if n is even, use the property (x^2)^(n/2)
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {
            // If n is odd, use the property x * (x^(n-1))
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }

    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int result = calcPower(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }
}
