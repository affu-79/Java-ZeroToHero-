
import java.util.*;

public class Program126 {

    // Isomorphic Strings :
// Check if strings s and t are isomorphic:
// Every character in s maps to exactly one character in t, and vice versa.
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapST = new HashMap<>(); // s → t
        Map<Character, Character> mapTS = new HashMap<>(); // t → s

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i); // char from s
            char c2 = t.charAt(i); // char from t

            // Check mapping from s → t
            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) {
                    return false;
                }
            } else {
                mapST.put(c1, c2);
            }

            // Check reverse mapping from t → s
            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) {
                    return false;
                }
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "egg", t1 = "add"; // true
        String s2 = "foo", t2 = "bar"; // false

        System.out.println("Is egg and add isomorphic? " + isIsomorphic(s1, t1));
        System.out.println("Is foo and bar isomorphic? " + isIsomorphic(s2, t2));
    }
}
