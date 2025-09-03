import java.util.Scanner;
// calculate x^n using Recursion
public class Recursion5 {
    public static int calculatePower( int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        // int sol = calculatePower(x, n-1);
        // int ans = x * sol;
        // return ans;
        if(n % 2 == 0){
            return calculatePower(x, n/2) * calculatePower(x, n/2);
        }
        else{
            return calculatePower(x, n/2) * calculatePower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        System.out.println("Enter the term");
        int n = sc.nextInt();
        int ans = calculatePower(x, n);
        System.out.println("Solution = "+ans);
    }
}

