
public class Program63 {
//print reverse of a string using recursion

    public static void printRev(String str, int indx) {
        if (indx == 0) {
            System.out.println(str.charAt(indx));
        }
        System.out.print(str.charAt(indx));
        printRev(str, indx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("string : " + str);
        printRev(str, str.length() - 1);
    }
}
