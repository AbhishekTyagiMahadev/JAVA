import java.util.Scanner;

public class Binary_Decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();
        
        try {
            int decimalValue = binaryToDecimal(binaryString);
            System.out.println("Decimal value: " + decimalValue);
        } catch (NumberFormatException e) {
            System.out.println("Invalid binary number.");
        }
    }

    public static int binaryToDecimal(String binaryString) {
        // Validate if the string is a valid binary number
        if (!binaryString.matches("[01]+")) {
            throw new NumberFormatException("Not a valid binary number");
        }
        
        int decimalValue = 0;
        int length = binaryString.length();
        
        for (int i = 0; i < length; i++) {
            // Get the character at the current position
            char bit = binaryString.charAt(length - 1 - i);
            // Convert the character to an integer (0 or 1) and calculate its decimal value
            decimalValue += (bit - '0') * Math.pow(2, i);
        }
        
        return decimalValue;
    }
}