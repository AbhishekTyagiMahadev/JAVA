// WAP to calculate average of three numbers.
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double avg = calculation(a, b, c);
        System.out.println("Average: " + avg);
    }

    public static double calculation(double a, double b, double c) {
        return (a + b + c)/3;
    }
}
