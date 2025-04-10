
import java.util.*;

public class Program44 {

    //Strings( Input an email from user. you have to create a username from email by dleting the part that comes after @ symobol and displaythe username)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a email address: ");
        String email = sc.nextLine();
        String userName = " ";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }
        System.out.println("The username is: " + userName);
    }

}
