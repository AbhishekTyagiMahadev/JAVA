class Linked_list {
    Node head;
    
    // String head = null;
    class Node {

        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(String data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        
    // Add last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) { 
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // Print List
    public void printList(){
        if( head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) { 
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    // Delete node
    public void deleteFirst(){
        if( head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    public void deleteLast(){
        if( head == null){
            System.out.println("List is empty");
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        if(head.next == null){
            head.next = null;
        }
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    
    public static void main(String[] args) {
        Linked_list list = new Linked_list();
        // list.printList();
        list.addFirst("tyagi");
        list.addFirst("abhishek");
        list.printList();
        list.addLast("mahadev");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        list.deleteFirst();
        list.printList();

    }
}