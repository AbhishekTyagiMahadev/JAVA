import java.util.Scanner;
public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String name = sc.nextLine();
        printName(name);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum: " + sum(a, b)); 
        System.out.println("Multiplication: " + mul(a, b)); 
    }
    public static void printName(String name) {
        System.out.println("Name: " + name); 
        return;  
    }
    public static int sum(int a, int b) {
        int ans = a + b;
        return ans;  
    }
    public static int mul(int a, int b) {
        return a * b;  
    }
}
