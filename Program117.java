
import java.util.*;

public class Program117 {

    //solve the Union of Two Arrays problem using Hashing in Java
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        Set<Integer> unionSet = new HashSet<>();

        // Add all elements from arr1
        for (int num : arr1) {
            unionSet.add(num);
        }

        // Add all elements from arr2
        for (int num : arr2) {
            unionSet.add(num);
        }

        // Print the union elements
        System.out.println("Union of arrays: " + unionSet);

        // Print the count
        System.out.println("Count of unique elements (Union size): " + unionSet.size());
    }
}
