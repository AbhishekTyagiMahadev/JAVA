import java.util.Scanner;
public class OccuranceOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        int first = -1;
        int last = -1;
        findOccur(str, first, last, 0);
    }
    public static void findOccur(String str,  int first, int last, int i) {
        if (i == str.length()) {
            if(first == -1) {
                System.out.println("'a' is not avilable in this string");
            } else if (last == -1) {
                last = first;
                System.out.print("First and Last occurance of 'a' is at index: " + last);
            } else {
                System.out.print("First occurance of 'a' is at index: " + first + "\nLast occurance of 'a' is at index: " + last);
            }
            return;
        }
        if('a' == str.charAt(i)) {
            if(first == -1) {
                first = i;
            } else {
                last = i;
            }
        }
        findOccur(str, first, last, i+1);
    }
}
