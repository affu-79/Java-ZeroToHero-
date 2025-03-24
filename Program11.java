//print the ssum of first N natural Numbers

public class Program11 {

    public static void main(String[] args) {
        //let the N = 10
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("sum of first  " + n + " natural numbers = " + sum);

    }
}
