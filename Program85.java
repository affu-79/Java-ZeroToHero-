
// Inheritance : single level Inheritance
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Program85 {

    public static void main(String[] aargs) {
        Dog d = new Dog();
        d.sound();

    }
}
