
import java.util.*;

public class Program26 {
//function to print name

    public static void printName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();

        printName(name);
    }
}
