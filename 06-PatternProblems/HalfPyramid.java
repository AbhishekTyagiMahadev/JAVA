// Pattern
// *
// * *
// * * *
// * * * *
// * * * * *

import java.util.Scanner;
public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hight of Pyramid: ");
        int h = sc.nextInt();
        for(int i = 0; i < h; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
