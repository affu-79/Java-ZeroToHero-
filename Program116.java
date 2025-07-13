
import java.util.*;

public class Program116 {

    //majority element :given an integer array of size n, find all elements that apper more tha [n/3] times
    public static List<Integer> findMajorityElements(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Step 1: Count frequency of each element
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find elements with frequency > n/3
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1};
        List<Integer> result = findMajorityElements(nums);
        System.out.println("Majority elements (> n/3): " + result);
    }
}
