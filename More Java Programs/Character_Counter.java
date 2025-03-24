// Program to count the letter, spaces, numbers and special characters in a string
import java.util.Scanner;

public class Character_Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        
        // Initialize counters
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int specialCharCount = 0;
        
        // Iterate through each character in the string
        for (char ch : inputString.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                specialCharCount++;
            }
        }
        
        // Display the counts
        System.out.println("Letters: " + letterCount);
        System.out.println("Numbers: " + numberCount);
        System.out.println("Spaces: " + spaceCount);
        System.out.println("Special Characters: " + specialCharCount);
    }
}