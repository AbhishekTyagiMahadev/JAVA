import java.util.List;
import java.util.Random;

public class FloydsAlgo {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node newHead;

    private int size;

    FloydsAlgo() {
        this.size = 0;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public void addCycle() {
        Random rand = new Random();
        int randomNum = rand.nextInt(this.getSize());
        int i = 0;
        Node temp = head;
        Node currNode = head;
        if (head == null) {
            System.out.println("Linked List is empty");
        }
        while (i <= randomNum) {
            temp = temp.next;
            i++;
        }
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = temp;
    }

    public boolean checkCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println(fast.data);
                removeCycle(fast);
                return true;
            }
        }
        return false;
    }

    public void removeCycle(Node fast) {
        Node slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        FloydsAlgo list = new FloydsAlgo();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");

        list.display();
        list.addCycle();
        boolean isCycle = list.checkCycle();
        System.out.println(isCycle);
        list.display();

    }
}
