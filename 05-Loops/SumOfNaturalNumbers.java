import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 0; i <= n; i++) {
            sum += i;
        }        
        System.out.println("Sum of "+ n + " Natural numbers is "+ sum);
    }
}
