import java.util.Scanner;
public class Factorial {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Calculate Factorial: ");
        int num = sc.nextInt(); 
        int fact = 1;
        System.out.println("Factorial of " + num + " is: " + calculateFact(num, fact));
    }
    public static int calculateFact(int num, int fact) {
        if(num==0) {
            return fact;
        }
        fact *= num;
        return calculateFact(num-1, fact);
    }
}