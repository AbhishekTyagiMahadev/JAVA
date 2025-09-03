// Pattern
//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5

import java.util.Scanner;
public class CompleteNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hight of Pyramid: ");
        int h = sc.nextInt();
        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= h-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
}
