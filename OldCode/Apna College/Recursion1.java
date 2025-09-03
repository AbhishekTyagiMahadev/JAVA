
import java.util.*;
// Print the numbers in accending order
public class Recursion1 {
    public static void printNumbe(int n, int num) {
        if(num == n+1){
            return;
        }
        System.out.print(num+" ");
        printNumbe(n, num+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = 1;
        int n = sc.nextInt();
        printNumbe(n, num);

    }
}
