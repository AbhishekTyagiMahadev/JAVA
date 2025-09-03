import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        int e1 = list.get(0);
        System.out.println(e1);

        list.add(2, 10);
        list.set(0, 20);
        System.out.println(list);

        System.out.println(list.size());

        Collections.sort(list);
        System.out.println(list);
    }
}
