import java.util.*;
public class SearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the values in this array: ");
        for(int i = 0; i < size; i++) 
            array[i] = sc.nextInt();
        
        System.out.print("Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.print("\nEnter a number of this array to find its index: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(array[i] == num) {
                System.out.println(num + " at " + i + "th index");
                count = 1;
            }
        }
        if(count==0)
            System.out.println(num + " not found!");
        
    }
}
