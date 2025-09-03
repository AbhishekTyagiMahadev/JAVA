import java.util.Scanner;
// calculate fibonacci series
public class Recursion4 {
    public static void fibonacci(int num1,int num2, int n) {
        if(n==0){
            return;
        }
        int num3 = num1+num2;
        System.out.print(num3+" ");
        // num1 = num1+num2;
        fibonacci(num2, num3, n-1);
    }
    public static void main(String[] args) {
        int num1 = 0, num2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term");
        int n = sc.nextInt();
        System.out.print(num1+" "+num2+" ");
        fibonacci(num1, num2, n-2);
    }
}
