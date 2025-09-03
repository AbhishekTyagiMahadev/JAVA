import java.util.*;
// sum of n natural numbers
public class Recursion2 {
    public static void printSum(int sum, int n) {
        if(n==0){
            System.out.println("Sum = "+sum);
            return;
        }
        sum += n;
        printSum(sum, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int sum = 0;
        int n = sc.nextInt(); 
        printSum(sum, n); 
    }
}
