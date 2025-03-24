// Program using trow and throws exceptions
import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number to calculate its square root: ");
            double number = scanner.nextDouble();
            double result = calculateSquareRoot(number);
            System.out.println("The square root of " + number + " is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }

    // Method that calculates the square root and throws an exception for negative numbers
    public static double calculateSquareRoot(double number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
        }
        return Math.sqrt(number);
    }
}
