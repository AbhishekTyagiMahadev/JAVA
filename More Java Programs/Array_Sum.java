// Program to sum the values of an array
import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
       
        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        // Calculate the sum of the array elements
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Display the result
        System.out.println("The sum of the array elements is: " + sum);
    }
}
