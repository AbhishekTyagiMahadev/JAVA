// WAP to calculate circumference of Circle.
import java.util.Scanner;
public class CircumferenceOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the of a Circle: ");
        double r = sc.nextDouble();
        calculation(r);
    }

    public static void calculation(double r) {
        double c = 2*3.14*r;
        System.out.print("Circumference of Circle: " + c);
    }
}
