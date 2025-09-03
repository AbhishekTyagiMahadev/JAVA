import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Numbers");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("For Addition(Press 1)");
        System.out.println("For Subtraction(Press 2)");
        System.out.println("For Multiplication(Press 3)");
        System.out.println("For Division(Press 4)");
        int button = sc.nextInt();

        switch(button) {
            case 1: 
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
                case 2:
                    System.out.println(a + " - " + b + " = " + (a - b));
                break;
                case 3:
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case 4:
                    System.out.println(a + " / " + b + " = " + (a / b));
                    break;
                default:
                    System.out.println("Invalid Input!");
        }
    }
}
