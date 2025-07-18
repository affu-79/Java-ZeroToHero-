
import java.util.HashSet;

public class Program127 {

    //Find Duplicates in an Array (Using HashSet)
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            // If the number is already in 'seen', it's a duplicate
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements: " + duplicates);
    }
}
