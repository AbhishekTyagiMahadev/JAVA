public class LinkedLists {
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

    LinkedLists() {
        this.size = 0;
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode; 
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

    public void deleteFirst() {
        size--;
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }
    
    public void deleteLast() {
        size--;
        if(head == null) {
            System.out.println("List is empty.");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        Node temp1 = head;
        Node temp2 = temp1;
        while(temp1.next != null) {
            temp2 = temp1;
            temp1 = temp1.next;
        }
        temp2.next = null;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addFirst("Tyagi");
        list.addFirst("Abhishek");

        list.addLast("Abhishek");
        list.addLast("Tyagi");
        
        list.display();
        System.out.println("Size of List is: " + list.getSize());
        
        list.deleteFirst();
        list.display();
        System.out.println("Size of List is: " + list.getSize());

        list.deleteLast();
        list.display();
        System.out.println("Size of List is: " + list.getSize());

    }
}
