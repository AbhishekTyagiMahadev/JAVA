import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        System.out.println("Length of Full Name: " + fullName.length());

        // charAt()
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        // compareTo()
        // if s1 = s2 returns 0
        // if s1 < s2 returns -ve
        // if s1 > s2 returns +ve

        if(firstName.compareTo(lastName) == 0) { 
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        String sub = fullName.substring(5, fullName.length());
        System.out.println("Sub String: " + sub);
    }
}
