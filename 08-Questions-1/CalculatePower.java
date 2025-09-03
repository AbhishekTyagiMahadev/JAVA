// WAP to Calculate X^n.
import java.util.Scanner;
public class CalculatePower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = x;
        for(int i = 1; i < n; i++) {
            ans *= x;
        }
        System.out.println(x + "^" + n + ": " + ans);
    }
}
