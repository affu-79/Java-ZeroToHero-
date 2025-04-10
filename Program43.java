
import java.util.*;

public class Program43 {
//Strings(Take input of a string from user.create a new string called'result' in which you will replace the letter'e' with letter'i')

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String result = str.replace('e', 'i');
        System.out.println(result);
    }

}
