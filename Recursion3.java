import java.util.*;
// factorial using recursion
public class Recursion3 {
    public static void printFactorial(int fact, int n) {
        if(n==0){
            System.out.println("factorial = "+fact);
            return;
        }
        fact *= n;
        printFactorial(fact, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int fact = 1;
        int n = sc.nextInt(); 
        printFactorial(fact, n); 
    }
}
