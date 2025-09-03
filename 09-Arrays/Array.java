import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 49;
        marks[1] = 45;
        marks[2] = 42;
        marks[3] = 47;
        marks[4] = 40;
        System.out.println("Marks: " + marks[0]);
        System.out.println("Marks: " + marks[1]);
        System.out.println("Marks: " + marks[2]);
        System.out.println("Marks: " + marks[3]);
        System.out.println("Marks: " + marks[4]);
        System.out.println("Length of marks: " + marks.length);
        Arrays.sort(marks);

        for(int i = 0; i < marks.length; i++) { 
            System.out.println("Marks: " + marks[i]);
        }
        System.out.println();

        int[] marks2 = {39, 50, 44, 46, 25};
        for(int i = 0; i < marks2.length; i++) { 
            System.out.println("Marks2: " + marks2[i]);
        }
    }
}
