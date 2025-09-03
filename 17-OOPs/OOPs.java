class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("I am writing something.");
    }
    public void printColor() {
        System.out.println(this.color);
    }
    public void printType() {
        System.out.println(this.type);
    }
}
public class OOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen1.write();
        pen1.printColor();
        pen1.printType();

    }
}
