import java.util.*;

public class Airthmetic_Exception {
    public static void main(String[] args) {
        // try {
        //     // Example of accessing an invalid index
        //     System.out.println("value =" +  50/0); // This will throw an exception
        // } 
        // catch(ArithmeticException e) {
        //     System.out.println(e);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("String = " + str.charAt(7));
        // System.out.println("Out of try block");
    }
}
