
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int i = str.length();
        System.out.print("Reverse String: ");
        reverseStr(str, i-1);
    }
    public static void reverseStr(String str, int i) {
        if(i == 0) {
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        reverseStr(str, i-1);
    }
}
