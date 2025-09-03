// Pattern
// * * * * *
// *       *
// *       *
// * * * * *

import java.util.Scanner;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Width of Rectangle: ");
        int w = sc.nextInt();
        System.out.print("Enter the Hight of Rectangle: ");
        int h = sc.nextInt();
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if(i==0 || i==h-1 || j==0 ||j==w-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }
}
