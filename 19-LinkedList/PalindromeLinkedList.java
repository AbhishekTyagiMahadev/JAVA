public class PalindromeLinkedList {
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

    PalindromeLinkedList() {
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

    public void devideList() {
        newHead = head;
        int i = 0;
        if(size%2 == 0) {
            Node temp = newHead;
            while(i < size/2) {
                temp = newHead;
                newHead = newHead.next;
                i++;
            }
            temp.next = null;
        } else {
            Node temp = newHead;
            while(i <= size/2) {
                temp = newHead;
                newHead = newHead.next;
                i++;
            }
            temp.next = null;
        }
        if(newHead == null || newHead.next == null) {
            return;
        }
        Node prevNode = newHead;
        Node currNode = newHead.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            
            prevNode = currNode;
            currNode = nextNode;
        }
        newHead.next = null;
        newHead = prevNode;
    }

    public void compair() {
        Node temp1 = head;
        Node temp2 = newHead;
        int check = 1;
        while(temp2 != null) {
            if(temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else {
                System.out.println("This is Not a Palindrome Linked List");
                check = 0;
                return;
            }
        }
        if(check == 1)
            System.out.println("This is a Palindrome Linked List");
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();

        list.addLast("1");
        list.addLast("1");
        list.addLast("3");
        list.addLast("2");
        list.addLast("1");
        
        list.display();
        list.devideList();
        list.compair();
    }
}
