// Program to convert the string into upper case
import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Convert the string to upper case
        String upperStr = convertToUpperCase(str);

        // Display the original and the upper-case strings
        System.out.println("Original String: " + str);
        System.out.println("Upper Case String: " + upperStr);
    }

    // Method to convert a string to upper case
    public static String convertToUpperCase(String str) {
        return str.toUpperCase();
    }
}
