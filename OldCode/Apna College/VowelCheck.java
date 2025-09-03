import java.util.Scanner;

public class VowelCheck{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a alphabet:");
        char ch = sc.next().toLowerCase().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered alphabet is vowel.");
                break;
            default:
                System.out.println("Entered alphabet is a consonent.");
        }
    }
}