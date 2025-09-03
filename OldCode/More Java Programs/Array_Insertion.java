// Program to insert element in an array
import java.util.Scanner;

public class Array_Insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Initialize the array
        int[] array = new int[size];
        
        // Enter the elements of the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Orignal array is:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        // Enter the element to insert
        System.out.print("\nEnter the element to insert: ");
        int elementToInsert = sc.nextInt();
        
        // Prompt the user to enter the position to insert the element
        System.out.print("Enter the position (0 to " + size + ") to insert the element: ");
        int position = sc.nextInt();
        
        // Check if the position is valid
        if (position < 0 || position > size) {
            System.out.println("Invalid position! Please enter a position between 0 and " + size);
        } 
        else {
            // Create a new array with one extra space
            int[] newArray = new int[size + 1];
            
            // Copy the elements to the new array
            for (int i = 0; i < position; i++) {
                newArray[i] = array[i];
            }
            
            // Insert the new element
            newArray[position] = elementToInsert;
            
            // Copy the remaining elements
            for (int i = position + 1; i <= size; i++) {
                newArray[i] = array[i - 1];
            }
            
            // Display the new array
            System.out.println("Array after insertion:");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}