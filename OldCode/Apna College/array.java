
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] array = new int[3];
        array[0] = 50;
        array[1] = 44;
        array[2] = 67;
        System.out.println(array[1]);
        System.out.println(array[0]);
        System.out.println(array[2]);
        System.out.println(array.length);

        Arrays.sort(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
    }
}