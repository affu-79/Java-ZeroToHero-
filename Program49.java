

public class Program49 {
//write a program to count the number of 1's in a binary representations of number

    public static void main(String[] args) {

        int number = 13;
        int count = 0;
        for (int n = number; n != 0; n = n >> 1) {
            count += n & 1;

        }
        System.out.println("Number of 1's in binary" + "(" + Integer.toBinaryString(number) + ")" + " representation of number " + number + " is: " + count);
    }

}
