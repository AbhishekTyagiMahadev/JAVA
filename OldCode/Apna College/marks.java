import java.util.*;
public class marks {
    public static void main(String [] args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.print("hindi=");
        int h= sc.nextInt();
        System.out.print("english=");
        int e= sc.nextInt();
        System.out.print("maths=");
        int m= sc.nextInt();
        System.out.print("science=");
        int s= sc.nextInt();
        System.out.print("art=");
        int a= sc.nextInt();
        int total= h+e+m+s+a;
        int percentage= total/5;
        System.out.println("total=" +total);
        System.out.println("percentage=" +percentage);
    }
}
