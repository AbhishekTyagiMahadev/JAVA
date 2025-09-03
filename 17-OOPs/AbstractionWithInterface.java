interface Animal {
    void sound(); // abstract method
    void sleep(); // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
    public void sleep() {
        System.out.println("Dog sleeps");
    }
}

public class AbstractionWithInterface {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound(); 
        a.sleep(); 
    }
}