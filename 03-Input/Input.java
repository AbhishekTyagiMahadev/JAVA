import java.util.Scanner;
public class Input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter name");
        // String name = sc.next();
        
        System.out.println("Enter full name");
        String fullName = sc.nextLine();
        
        System.out.println("Enter hight");
        double hight = sc.nextDouble();
        
        System.out.println("Enter age");
        int age = sc.nextInt();
        
        System.out.println("full name: " + fullName);
        System.out.println("age: " + age);
        System.out.println("hight: " + hight);
    }
}
