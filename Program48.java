
import java.util.*;

public class Program48 {
//write a porgram to toggle a bit position="pos" in a number "n" 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //number
        int pos = sc.nextInt(); //position
        int bit = (n >> pos) & 1; //get the bit at the given position
        System.out.println("Number:" + n + " Position:" + pos + " Bit:" + bit);
        System.out.println("binary:" + Integer.toBinaryString(n));
    }

}
