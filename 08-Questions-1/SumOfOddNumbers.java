// WAP to calculate sum of odd numbers between 1 to n.
import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of 'n': ");
        int n = sc.nextInt();
        calculation(n);
    }

    public static void calculation(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            if(i % 2 == 1){ 
                sum += i;
            }
        }
        System.out.println("Sum of Odd Numbers Between 1 to " + n + ": " + sum);
    }
}