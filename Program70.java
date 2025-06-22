
public class Program70 {
//Print all permutations of a string

    public static void printPerm(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            //"abc" -> "ab"
            String newString = str.substring(0, i) + str.substring(i + 1);  //remove the current character  from the string 
            printPerm(newString, permutation + currChar); //add the current character to permutation 
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");   //time complexity : O(n*n!) -> O(n!)
    }

}
