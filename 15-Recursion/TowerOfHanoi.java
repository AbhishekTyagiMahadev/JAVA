import java.util.Scanner;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        tower(n, "S", "H", "D");
    }

    public static void tower(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("Transfer dist " + n + " from " + src + " to " + dest);
            return;
        }
        tower(n-1, src, dest, helper);
        System.out.println("Transfer dist " + n + " from " + src + " to " + dest);
        tower(n-1, helper, src, dest);
    }
 }