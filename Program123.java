
import java.util.*;

public class Program123 {

    //Group Anagrams 
    public static void main(String[] args) {
        List<String> words = Arrays.asList("bat", "tab", "cat", "act");
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : words) {
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            anagramGroups.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        System.out.println(anagramGroups.values());
    }
}
