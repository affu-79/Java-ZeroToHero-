
class Student {
    // compile -time polymorphism  [ method overloading ]

    String name;
    int age;

    public void printInfo(String name, int age) {
        System.out.println("name is :  " + name + ", age is : " + age);

    }

    public void printInfo(String name) {
        System.out.println("name : " + name);

    }

    public void printInfo(int age) {
        System.out.println("age : " + age);

    }
}

public class Program84 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo("affu");
        s1.printInfo(21);
        s1.printInfo("affu", 21);

    }
}
