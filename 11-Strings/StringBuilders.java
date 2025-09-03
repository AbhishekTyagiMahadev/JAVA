public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Abhishek");
        System.out.println("Name: " + name);
        
        // charAt()
        System.out.println(name.charAt(0));

        // change character
        name.setCharAt(0, 'T');
        System.out.println("Name: " + name);
        
        // Insert
        name.insert(5, 'T');
        System.out.println("Name: " + name);
        
        // delete
        name.delete(3, 6);
        System.out.println("Name: " + name);
        
        // Append
        name.append(" Tyagi");
        System.out.println("Name: " + name);
    }
}
