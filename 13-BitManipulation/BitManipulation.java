public class BitManipulation {
    public static void main(String[] args) {
        int n = 111;
        int pos = 5;
        int bitMask = n << pos-1;
        if((bitMask & n) == 0) {
            System.out.println("Zero");
            System.out.println(Integer.toBinaryString(n));
            System.out.println(Integer.toBinaryString(bitMask));
        } else {
            System.out.println("One");
            System.out.println(Integer.toBinaryString(n));
            System.out.println(Integer.toBinaryString(bitMask));
        }
    }
}
