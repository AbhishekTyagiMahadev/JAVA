import java.util.Scanner;
public class SubsequenceString {
    public static boolean[] map = new boolean[26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        subsequences(str, "", 0);
    }
    public static void subsequences(String str, String newStr, int i) {
        if(i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(i);
        
        subsequences(str, newStr+current, i+1);
        subsequences(str, newStr, i+1);
    }
}