
class Pen {

    String color;
    String type;

    public void write() {
        System.out.println("Writing with a pen ");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

public class Program80 {

    public static void main(String[] args) {

        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ballpoint";

        Pen pen2 = new Pen();
        pen2.color = "red";
        pen2.type = "gel";

        pen1.printColor();
        pen2.printColor();

    }
}
