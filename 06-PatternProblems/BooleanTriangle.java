// Pattern
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

import java.util.Scanner;
public class BooleanTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Hight of Pyramid: ");
        int h = sc.nextInt();
        for(int i = 1; i <= h; i++) {
            for(int j = 1; j <= i; j++) {
                    if((i+j) % 2 == 0) 
                        System.out.print(1 + " ");
                    else
                        System.out.print(0 + " ");
                }
            System.out.print("\n");
        }
    }
}