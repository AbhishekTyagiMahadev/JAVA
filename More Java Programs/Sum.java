// Program to print sum of two numbers
import java.util.Scanner;
public class Sum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // Take two number as input
        System.out.print("Enter the first number = ");
        int a = sc.nextInt();
        
        System.out.print("Enter the second number = ");
        int b = sc.nextInt();

        // Calculate and print the sum of two numbers
        System.out.println("Sum of "+ a +" and "+ b +" = "+ (a+b));
    }
}
