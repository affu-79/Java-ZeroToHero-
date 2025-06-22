
public class Program67 {

    public static boolean[] map = new boolean[26];

    //Remove Duplicates from a String : "abbccda"
    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }

    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, " ");
    }

}
