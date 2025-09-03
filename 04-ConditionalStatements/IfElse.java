import java.util.Scanner;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if(age>18) {
            System.out.println("You are Adult");
        } else {
            System.out.println("You are Not Adult");
        }

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if(num % 2 == 0) {
            System.out.println("This is An Even Number");
        } else {
            System.out.println("This is An Odd Number");
        }

        System.out.println("Enter two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b) {
            System.out.println("a is greater");
        } else if(a<b) {
            System.out.println("a is lesser");
        } else {
            System.out.println("a and b are equal numbers");
        }
    }
}
