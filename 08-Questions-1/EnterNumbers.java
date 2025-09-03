// WAP in which user enter numbers till he wants and at the end display the count of +ve, -ve and zeros.
import java.util.Scanner;
public class EnterNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0;
        int n = 0; 
        int z = 0;
        boolean responce = true;
        while (responce == true) { 
            System.out.print("Enter any Number: ");
            int num = sc.nextInt();
            if( num < 0)
                n++;
            else if (num > 0)
                p++;
            else
                z++;
            System.out.print("If you want continue type true otherwise false: ");
            responce = sc.nextBoolean();
        }
        System.out.println("You Entered " + p + " Positive Numbers");
        System.out.println("You Entered " + n + " Negative Numbers");
        System.out.println("You Entered " + z + " Zeros");
    }
}