
import java.util.*;

public class Program121 {

    //Find first non-repeating character in a string
    public static void main(String[] args) {
        String s = "google";
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (freq.get(c) == 1) {
                System.out.println("First non-repeating: " + c);
                break;
            }
        }

    }
}
