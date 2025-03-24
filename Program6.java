// ------------  program to make a simple calculator using switch case  ----------- //

import java.util.*;

public class Program6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float sum, diff, product, div;
        System.out.println("enter the two numbers:");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("enter the choice [ Addition - 1 | subtraction - 2 | multiplication - 3 | division - 4 ]");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                sum = a + b;
                System.out.println("The sum is: " + sum);
                break;
            case 2:
                diff = a - b;
                System.out.println("The difference is: " + diff);
                break;
            case 3:
                product = a * b;
                System.out.println("The product is: " + product);
                break;
            case 4:
                div = a / b;
                System.out.println("The division is: " + div);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
