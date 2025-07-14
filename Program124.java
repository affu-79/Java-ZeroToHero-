
import java.util.*;

public class Program124 {

    //Count Distinct Elements in Every Window of Size K
    public static List<Integer> countDistinctElements(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();           // To store result for each window
        Map<Integer, Integer> freqMap = new HashMap<>();    // To store frequency of elements in window

        // Initialize first window
        for (int i = 0; i < k; i++) {
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1); // Count frequency
        }

        result.add(freqMap.size()); // Add count of distinct elements in first window

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            int toRemove = arr[i - k]; // Element going out of window

            // Decrease its frequency
            freqMap.put(toRemove, freqMap.get(toRemove) - 1);

            // Remove it completely if frequency is 0
            if (freqMap.get(toRemove) == 0) {
                freqMap.remove(toRemove);
            }

            // Add new element coming into the window
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);

            // Add current distinct count
            result.add(freqMap.size());
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        System.out.println("Distinct counts in each window of size " + k + ": " + countDistinctElements(arr, k));
    }
}
