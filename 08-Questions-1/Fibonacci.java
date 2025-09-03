// WAP to print Fibonacci Series.
public class Fibonacci {
    public static void main(String[] args) {
        int n = 15;
        int a;
        int b = 1;
        int c = 0;
        for(int i = 1; i <= n; i++) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
