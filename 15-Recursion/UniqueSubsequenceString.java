import java.util.*;
public class UniqueSubsequenceString {
    public static boolean[] map = new boolean[26];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        subsequences(str, "", 0, set);
    }
    public static void subsequences(String str, String newStr, int i, HashSet<String> set) {
        if(i == str.length()) {
            if(set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char current = str.charAt(i);
        
        subsequences(str, newStr+current, i+1, set);
        subsequences(str, newStr, i+1, set);
    }
}
