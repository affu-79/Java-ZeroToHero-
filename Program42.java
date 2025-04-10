
import java.util.*;

public class Program42 {
//Strings(Take an array of Strings Input from users and find the cumalative(combined)length of all the strings)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings you want to input: ");
        int n = sc.nextInt();
        String[] str = new String[n];
        int totalLength = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string " + (i + 1) + ": ");
            str[i] = sc.next();
            totalLength += str[i].length();
        }
        System.out.println("The cumulative length of all the strings is: " + totalLength);
    }

}
