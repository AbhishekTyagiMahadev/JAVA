// Pattern
//         * * * * *
//       * * * * * 
//     * * * * *
//   * * * * *
// * * * * *

import java.util.Scanner;
public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hight of Pyramid: ");
        int h = sc.nextInt();
        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= h-i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= h; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
