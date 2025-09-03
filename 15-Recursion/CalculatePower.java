import java.util.Scanner;
public class CalculatePower {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        int x = sc.nextInt(); 
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt(); 
        System.out.print(x + "^" + n + ": " + calculate(x, n));
    }
    public static int calculate(int x, int n) {
        if(x==0) {
            return 0;
        }
        else if(n==0){
            return 1;
        }
        return x*calculate(x, n-1);
    }
}