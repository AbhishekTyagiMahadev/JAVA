import java.util.LinkedList;

public class LinkedListsCollections {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("Abhishek");
        list.addFirst("I am ");
        list.addLast("Tyagi");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("NULL");

        list.removeFirst();
        System.out.println(list);

        list.remove(list.size()-1);
        System.out.println(list);
    }
}
