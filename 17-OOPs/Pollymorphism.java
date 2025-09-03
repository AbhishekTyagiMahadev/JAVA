public class Pollymorphism {
    
    // Method overloading: same method name, different parameters
    void show(int a) {
        System.out.println("Argument: " + a);
    }

    void show(String s) {
        System.out.println("Argument: " + s);
    }

    public static void main(String[] args) {
        Pollymorphism obj = new Pollymorphism();
        obj.show(10);         // Calls show(int a)
        obj.show("Hello");    // Calls show(String s)
    }
}
