
import java.util.*;

public class Program120 {

    //Given an array of integers arr[] and an integer K, return the number of continuous subarrays whose sum equals K.
    public static int countSubarraysWithSumK(int[] arr, int K) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        int currentSum = 0;
        int count = 0;

        prefixSumCount.put(0, 1); // Important: to handle subarray from index 0

        for (int num : arr) {
            currentSum += num;

            // Check if there's a prefix sum that matches currentSum - K
            if (prefixSumCount.containsKey(currentSum - K)) {
                count += prefixSumCount.get(currentSum - K);
            }

            // Update the prefix sum frequency
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int K = 3;
        System.out.println("Number of subarrays with sum " + K + ": " + countSubarraysWithSumK(arr, K));
    }
}
