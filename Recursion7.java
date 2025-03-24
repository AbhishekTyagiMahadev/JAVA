//Reverse string
import java.util.*; 
 public class Recursion7 {
    public static void reverseString(int n, String str) {
        if( n == -1 ){
            return;
        }
        System.out.print(str.charAt(n));
        reverseString(n-1, str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        int n = str.length();
        reverseString(n-1, str);
    }
}
