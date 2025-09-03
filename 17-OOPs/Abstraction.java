abstract class Animal {
    abstract void sound(); // abstract method (no body)
    void sleep() {         // concrete method
        System.out.println("Animal sleeps");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sleep();
    }
}
