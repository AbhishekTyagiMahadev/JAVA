public class ReverseString {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Abhishek");
        System.out.println("Name: " + name);
        
        for (int i = name.length()-1; i >= 0; i--) {
            name.append(name.charAt(i));
            name.delete(i, i+1);
        }
        System.out.println("Reverse Name: " + name);

        
    }
}
