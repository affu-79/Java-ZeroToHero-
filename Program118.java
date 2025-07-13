
import java.util.*;

public class Program118 {

    // [union problems] | the Intersection of Two Arrays using Hashing in Java 
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        Set<Integer> set = new HashSet<>();
        List<Integer> intersection = new ArrayList<>();

        // Step 1: Add all elements from arr1 to set
        for (int num : arr1) {
            set.add(num);
        }

        // Step 2: Check elements of arr2 for intersection
        for (int num : arr2) {
            if (set.contains(num)) {
                intersection.add(num);
                set.remove(num); // Ensure uniqueness
            }
        }

        // Output
        System.out.println("Intersection of arrays: " + intersection);
    }
}
