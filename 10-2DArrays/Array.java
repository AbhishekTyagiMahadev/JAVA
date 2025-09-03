import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        System.out.println("Enter values of array: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter a number to find its index: ");
        int num = sc.nextInt();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++){
                if(numbers[i][j] == num) {
                    System.out.println(num + " avilable at index(" + i + ", " + j + ")");
                    count = 1;
                }
            }
        }
        if(count == 0)
            System.out.println(num + " not found!");
    }
}
