// abstraction - example:2
// Interface (100% abstraction)

interface Animal {

    void sound();  // abstract method
}

// Implementing class
class Dog implements Animal {

    public void sound() {
    

'
        
        System.out.println("Dog barks");
    }
}

public class Program90 {

    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); // Output: Dog barks
    }
}
