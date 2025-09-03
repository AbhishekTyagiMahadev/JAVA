class Parent {
    void show(int a) {
        System.out.println("Parent Argument: " + a);
    }
}

// Multilevel Inheritance
class Child extends Parent {
    void show(String s) {
        System.out.println("Child Argument: " + s);
    }
}

// Hierarchical Inheritance
class AnotherChild extends Parent {
    void display() {
        System.out.println("AnotherChild specific method");
    }
}

// Multiple Inheritance via Interfaces
interface Printable {
    void print();
}

interface Showable {
    void showMsg();
}

class Demo implements Printable, Showable {
    public void print() {
        System.out.println("Printable interface method");
    }
    public void showMsg() {
        System.out.println("Showable interface method");
    }
}

public class Inheritance extends Child {
    public static void main(String[] args) {
        // Single & Multilevel Inheritance
        Inheritance obj = new Inheritance();
        obj.show(10);         // Inherited from Parent
        obj.show("Hello");    // Defined in Child

        // Hierarchical Inheritance
        AnotherChild ac = new AnotherChild();
        ac.show(20);          // Inherited from Parent
        ac.display();         // Specific to AnotherChild

        // Multiple Inheritance via Interfaces
        Demo d = new Demo();
        d.print();
        d.showMsg();
    }
}