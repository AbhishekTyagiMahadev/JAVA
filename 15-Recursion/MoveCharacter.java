import java.util.Scanner;
public class MoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        moveChar(str, 0, 0, "");
    }
    public static void moveChar(String str,  int count, int i, String newStr) {
        if (i == str.length()) {
            for(int j=0; j<count; j++) {
                newStr += 'x';
            }
            System.out.println("New String: " + newStr);
            return;
        }
        if(str.charAt(i) == 'x') {
            count++;
            moveChar(str, count, i+1, newStr);
        } else {
            newStr += str.charAt(i);
            moveChar(str, count, i+1, newStr);
        }
    }
}

