import java.util.*;

public class InsertAtBottom {
    public static void pushBottom(int num, Stack<Integer> s) {
        if (s.isEmpty()) {
            s.push(num);
            return;
        }
        int top = s.pop();
        pushBottom(num, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(80);

        System.out.print("\nEnter a number to be insert at bottom of stack: ");
        int num = sc.nextInt();
        pushBottom(num, s);

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
