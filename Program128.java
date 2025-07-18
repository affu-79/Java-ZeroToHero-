
import java.util.HashMap;

public class Program128 {

//First Non-Repeating Character in a String (Using HashMap)
    public static void main(String[] args) {
        String s = "aabbcdde";

        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency = 1
        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        }

        System.out.println("No unique character found.");
    }
}
