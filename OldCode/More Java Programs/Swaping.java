// Program for swaping two numbers 
import java.util.Scanner;
public class Swaping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        // Display numbers before swapping
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swap without using a temporary variable
        a = a + b;
        b = a - b; 
        a = a - b;
        
        // Display numbers after swapping
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}