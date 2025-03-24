// Program to calculate the area and perameter of rectangle
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input length and width
        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        
        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();
        
        // Calculate area and perimeter
        int area = length * width;
        int perimeter = 2 * (length + width);
        
        // Display the results
        System.out.println("Area of the rectangle = " + area);
        System.out.println("Perimeter of the rectangle = " + perimeter);
    }
}