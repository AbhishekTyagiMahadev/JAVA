// Program to reverse a string
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a string to reverse: ");
        String inputString = sc.nextLine();
        
        // Call the reverseString method and print the result
        String reversedString = reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}