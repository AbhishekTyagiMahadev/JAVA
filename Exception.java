public class Exception {
    public static void main(String[]args){
        try {
            int a[] = new int[5];
            a[5] = 10/0;
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmaticException occurs");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
        // catch (Exception e) {
        //     System.out.println("Exception occurs");
        // }
        System.out.println("Out of block");
    }
}
