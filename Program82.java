
class Student {
    // Parameterized constructor 

    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student(String _name, int _age) {
        System.out.println("parameteraized constructor called");
        this.name = _name;
        this.age = _age;
    }

}

public class Program82 {

    public static void main(String[] args) {
        Student s1 = new Student("affu", 20);

        s1.printInfo();
    }
}
