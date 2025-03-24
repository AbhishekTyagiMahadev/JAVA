// Program to find the second largest element in an array

import java.util.Scanner;

public class Second_Largest {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        // Initialize the array
        int[] arr = new int[size];
        
        // Enter the elements of the array
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int secondLargest = findSecondLargest(arr);
        System.out.println("The second largest element is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return second;
    }
}
