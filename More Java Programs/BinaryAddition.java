// Program of adding two binary numbers
import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take two binary numbers as input from the user
        System.out.print("Enter the first binary number: ");
        String binary1 = sc.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = sc.nextLine();

        // Convert binary strings to decimal integers
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the two decimal integers
        int sum = num1 + num2;

        // Convert the sum back to a binary string
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("The sum of " + binary1 + " and " + binary2 + " is " + binarySum);
    }
}

