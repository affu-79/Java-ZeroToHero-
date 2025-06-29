
import java.lang.Math;
//Multi level Inheritance

class Shape {

    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {

    public void area(int l, int h) {
        System.out.println("area of triangle is " + (0.5 * l * h));
    }
}

class EquilateralTriangle extends Triangle {

    public void area() {
        System.out.println("area of equilateral triangle is " + (Math.sqrt(3) / 4 * Math.pow(5, 2)));
    }
}

public class Program86 {

    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        T1.area(1, 5);
        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.area();
    }
}
