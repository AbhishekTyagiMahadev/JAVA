// Pattern
// * * * *
// * * *
// * *
// *

import java.util.Scanner;
public class InvertedHalfPyramid {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hight of Pyramid: ");
        int h = sc.nextInt();
        for(int i = h; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
