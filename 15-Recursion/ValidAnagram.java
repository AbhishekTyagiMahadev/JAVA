import java.lang.reflect.Array;
import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter a String: ");
        String angStr = sc.nextLine();
        anagram(str, angStr);
    }

    public static void anagram(String str, String angStr) {
        if (str.length() != angStr.length()) {
            System.out.println("The Strings are not Anarams.");
            return;
        }
        char[] strSort = str.toCharArray();
        char[] angStrSort = angStr.toCharArray();
        Arrays.sort(strSort);
        Arrays.sort(angStrSort);
        if(Arrays.equals(strSort, angStrSort))
            System.out.println("The Strings are Anagarms.");
        else
            System.out.println("The Strings are not Anarams.");
    }  
}
