
import java.util.*;

public class Program46 {
//BIT MANIPULATION( update the 2nd bit(position=1)of a number n to 1.(n=0101))

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt(); //operation
        //oper=1:SET   and   oper=0:CLEAR
        int n = sc.nextInt(); //number
        int pos = sc.nextInt(); //position
        int bitmask = 1 << pos; //create a bitmask with 1 at the given position
        if (oper == 1) {
            int newNumber = n | bitmask;
            System.out.println("The new number after setting the bit is: " + newNumber);
        } else {
            int Notbitmask = ~bitmask; //create a bitmask with 0 at the given position
            int newNumber = n & Notbitmask; //clear the bit at the given position
            System.out.println("The new number after clearing the bit is: " + newNumber);
        }
    }
}
