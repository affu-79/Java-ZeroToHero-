
public class Program33 {
//arrays 

    public static void main(String[] args) {
        int[] marks = new int[3];
        //int marks[]=new int[3];
        marks[0] = 97;//phy
        marks[1] = 98;//chem
        marks[2] = 99;//maths
        // System.out.println(marks[0]);//phy
        // System.out.println(marks[1]);//chem
        // System.out.println(marks[2]);//maths

        //or//
        // [  int marks[]={97,98,99};  ]   //Defining the array knowing the size..
        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}
