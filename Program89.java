// Abstract class

abstract class Shape {

    // Abstract method (no body)
    abstract void draw();

    // Concrete method
    void display() {
        System.out.println("This is a shape.");
    }
}

// Concrete subclass
class Circle extends Shape {

    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Program89 {

    public static void main(String[] args) {
        Shape s = new Circle(); // Upcasting
        s.draw();               // Calls the overridden method
        s.display();            // Calls the concrete method from base
    }
}
