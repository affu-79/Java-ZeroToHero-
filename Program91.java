
import java.util.LinkedList;
import java.util.Scanner;
// This program demonstrates the use of a LinkedList  using Java's built-in LinkedList class.

class Program91 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");     // add first element
        list.addFirst("is");
        System.out.println(list); // print the linked list
        list.addLast("list");   // add last element
        list.addFirst("This");
        System.out.println(list);
        list.removeFirst();     // delete first element
        System.out.println(list);
        list.removeLast();      // delete last element
        System.out.println(list);     // print the linked list

        System.out.println(list.size());

        System.out.print("enter the element to be searched: ");
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                System.out.println("Element " + value + " found at index: " + i);
            } else {
                System.out.println("Element " + value + " not found at index: " + i);
            }
            System.out.print(list.get(i) + " -> "); // print each element
        }
        System.out.println("NULL");
    }
}
