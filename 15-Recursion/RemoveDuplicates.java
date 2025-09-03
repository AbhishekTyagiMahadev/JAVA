import java.util.Scanner;
public class RemoveDuplicates {
    public static boolean[] map = new boolean[26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        remDuplicates(str, "", 0);
    }
    public static void remDuplicates(String str, String newStr, int i) {
        if(i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(i);
        if(map[current - 'a'] == true) {
            remDuplicates(str, newStr, i+1);
        } else {
            newStr += current;
            map[current - 'a'] = true;
            remDuplicates(str, newStr, i+1);
        }
    }
}
