import java.util.*;
class ArrayLists{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        
        // Get elements
        int element = list.get(0);
        System.out.println(element);
        
        // Add between
        System.out.println(list);
        list.add(1, 5);
        System.out.println(list);
        
        // Set element
        list.set(0, 6);
        System.out.println(list);
        
        // delete element
        list.remove(4);
        System.out.println(list);
        
        // length
        int size = list.size();
        System.out.println(size);
        
        // Sorting
        Collections.sort(list);
        System.out.println(list);

    }
}