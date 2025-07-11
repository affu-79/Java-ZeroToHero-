
public class Program114 {

    // This program demonstrates the use of an array in Java. using default for-each loop
    public static void main(String[] args) {

        int arr[] = {12, 15, 18};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");

        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println(" ");

    }
}
