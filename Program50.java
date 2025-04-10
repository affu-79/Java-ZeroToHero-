
import java.util.*;

public class Program50 {
//write 2 functions=>decimatToBinary() and binaryToDecimal() to convert a number from one system to another

    public static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.insert(0, decimal % 2);
            decimal /= 2;
        }
        return binary.toString();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        System.out.println("Enter a decimal number:");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        String binary = decimalToBinary(decimal);
        System.out.println("Decimal to Binary: " + binary);

        System.out.println("Enter a binary number:");
        String binaryInput = sc.next();
        int decimalOutput = binaryToDecimal(binaryInput);
        System.out.println("Binary to Decimal: " + decimalOutput);

    }

}
