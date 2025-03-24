//switch case implementation

import java.util.*;

public class Program5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the choice [1/2/3]: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Hello");
                break;
            case 2:
                System.out.print("Namste");
                break;
            case 3:
                System.out.println("Hola");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
