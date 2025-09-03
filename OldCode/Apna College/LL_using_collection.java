import java.util.*;
public class LL_using_collection {
   public static void main(String[] args) {
    LinkedList<String> list= new LinkedList<String>();
    list.addFirst(" Mahadev ");
    list.addFirst(" Tyagi ");
    list.addFirst(" Abhishek ");
    System.out.println(list);
    list.addLast("nothing");
    System.out.println(list);
    System.out.println(list.size());
   }
    
}
