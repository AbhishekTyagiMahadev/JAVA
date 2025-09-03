
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        // Guess The random number between and 100
        int ran=(int)(Math.random()*100);
    //    int ran=72;
        Scanner sc=new Scanner(System.in);
        int a;
        do { 
            System.out.println("Guess the number");
            a=sc.nextInt();
            if(a==ran){
                System.out.println("True");
                System.out.println("Random number is "+ran);
                break;
            }
            else if (a<0) {
                System.out.println("Code End");
                break;
            }
            else{
                System.out.println("wrong Number Try Again");
                if(a<ran){
                    System.out.println("Hint: Number is Greater than "+a);
                }
                else{
                    System.out.println("Hint: Number is Less than "+a);

                }
            }
        } while (a!=ran);
    }
}
