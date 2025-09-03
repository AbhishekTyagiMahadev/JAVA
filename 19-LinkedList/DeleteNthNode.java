import java.util.Scanner;

public class DeleteNthNode {
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    private int size;

    DeleteNthNode() {
        this.size = 0;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
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
        if(head == null) {
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

    public void findAndDeleteNode(int n) {
        if(head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        if(n>size) {
            System.out.println("Invalid index!");
            return;
        }
        int num = size - n;
        if(num == 0) {
            head = head.next;
            return;
        }
        Node currNode = head;
        for(int i = 0; i < num - 1 ; i++) {
            currNode = currNode.next;
        }
        currNode.next = currNode.next.next;
    }

    public static void main(String[] args) {
        DeleteNthNode list = new DeleteNthNode();

        list.addLast("My");
        list.addLast("Name");
        list.addLast("is");
        list.addLast("Abhishek");
        list.addLast("Tyagi");
        
        list.display();
        System.out.println("Size of Linked List is: " + list.getSize());
        Scanner sc = new Scanner(System.in);
        System.out.print("Select Node which you want to delete from backword: ");
        list.findAndDeleteNode(sc.nextInt());
        list.display();
    }
}