public class Exception_Handling {
    public static void main(String[] args) {
        int[] marks = {95, 98, 80};
        try {
            // Example of accessing an invalid index
            System.out.println("value =" + marks[8]); // This will throw an exception
        } 
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("There is an error: Index is out of bounds.");
            System.out.println(exception.toString());
        }
        finally{
            System.out.println("There is a general error");
        }

        // Print valid indexes
        System.out.println(marks[0] + "," + marks[1] + "," + marks[2]);
        System.out.println("Abhishk Tyagi");
    }
}
