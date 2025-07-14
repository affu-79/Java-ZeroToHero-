
import java.util.*;

public class Program125 {

    //Minimum Window Substring -Given strings s and t, find the smallest window in s that contains all characters of t.
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> need = new HashMap<>();     // Required character counts
        Map<Character, Integer> window = new HashMap<>();   // Current window character counts

        // Count frequency of each char in t
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left = 0, right = 0;
        int required = need.size();  // Total unique characters needed
        int formed = 0;              // How many required characters are currently satisfied
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // If the current character meets the required frequency
            if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) {
                formed++;
            }

            // Try to shrink the window
            while (left <= right && formed == required) {
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char removeChar = s.charAt(left);
                window.put(removeChar, window.get(removeChar) - 1);

                // If removing breaks the requirement
                if (need.containsKey(removeChar) && window.get(removeChar) < need.get(removeChar)) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println("Minimum window containing all characters: " + minWindow(s, t));
    }
}
