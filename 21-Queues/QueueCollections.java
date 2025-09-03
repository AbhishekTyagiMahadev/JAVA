import java.util.Queue;
import java.util.LinkedList;
public class QueueCollections {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(12);
        q.add(123);
        q.add(1234);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
