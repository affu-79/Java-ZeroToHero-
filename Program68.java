
public class Program68 {

    // This Recursion Program is [  IMPORTANT !! ]
    //PRINT THE SUBSEQUENCE OF A STRING -> input : "abc"
    public static void SubSequence(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // 1st case: to be
        SubSequence(str, idx + 1, newString + currChar);
        // 2nd case: not to be
        SubSequence(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        SubSequence(str, 0, "");

    }

}
