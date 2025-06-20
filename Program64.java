
public class Program64 {

    //find the 1st and last occurrence of an element in string using recursion
    public static int first = -1, last = -1;

    public static void findOccurence(String str, int indx, char element) {
        if (indx == str.length()) {
            // Base case: if we have reached the end of the string
            System.out.println("the first occurance of element is at index :  " + first);
            System.out.println("the last occurance of element is at index :  " + last);

        }
        // Recursive case: check the current character
        char currChar = str.charAt(indx);
        if (currChar == element) {
            if (first == -1) {
                first = indx; // first occurrence
            } else {
                last = indx; // last occurrence} 
            }
        }
        // Continue to the next character
        findOccurence(str, indx + 1, element);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        System.out.println("string:" + str);
        // Find the first and last occurrence of 'a'
        findOccurence(str, 0, 'a');
    }
}
