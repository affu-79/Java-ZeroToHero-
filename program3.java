//Conditionals in java 1.if-else 2.switch-case 3.break

import java.util.*;

public class program3 {

    public static void main(String[] args) {
        // Entry point of the program
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not Adult");
        }

    }
}
