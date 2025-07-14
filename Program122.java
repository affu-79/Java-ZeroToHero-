
import java.util.*;

public class Program122 {
// Two Sum Problem

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
            }
            map.put(nums[i], i);
        }
    }
}
