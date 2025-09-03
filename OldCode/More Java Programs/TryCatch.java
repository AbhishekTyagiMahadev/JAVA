// Program using try, catch and finally exceptions
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            // Prompt the user to enter an index
            System.out.print("Enter an index to access an element from the array: ");
            int index = scanner.nextInt();

            // Attempt to access the array element at the given index
            int number = numbers[index];
            System.out.println("Number at index " + index + ": " + number);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e);
        } finally {
            System.out.println("Finally block executed.");
            scanner.close();  // Ensure the scanner is closed to free up resources
        }

        System.out.println("End of program.");
    }
}
