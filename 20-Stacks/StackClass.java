import java.util.Stack;
public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack();

        s.push(1);
        s.push(12);
        s.push(14);
        s.push(15);
        s.push(100);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
