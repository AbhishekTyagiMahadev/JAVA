import java.util.*;
public class KeypadCombination {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno",
     "pqrs", "tu", "vwx", "yz"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your keycombination: ");
        String str = sc.nextLine();
        keyCombination(str, 0, "");
    }
    public static void keyCombination(String str, int i, String newStr) {
        if(i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(i);
        String mapping = keypad[current - '0'];

        for(int j = 0; j<mapping.length(); j++) {
            keyCombination(str, i+1, newStr+mapping.charAt(j));
        }
    }
}