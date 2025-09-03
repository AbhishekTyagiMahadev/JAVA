import java.util.Scanner;
public class Fibonacci {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of values: ");
        int num = sc.nextInt(); 
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        calculateFib(num-2, a, b);
    }
    public static void calculateFib(int num, int a, int b) {
        if(num==0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        calculateFib(num-1, b, c);
    }
}