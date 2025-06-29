
class Student {

    // Copy constructor 
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student(Student s2) {
        System.out.println("copy constructor called");
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }

}

public class Program83 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "affu";
        s1.age = 20;
        Student s2 = new Student(s1);

        s2.printInfo();
    }
}
