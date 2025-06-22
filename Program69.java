
public class Program69 {
//Print keypad Combination

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0']; // mapping of currChar to keypad string
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));//adding levels to the combination
        }

    }

    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");
    }

}
