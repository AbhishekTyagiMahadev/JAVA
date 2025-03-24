import java.util.*;
public class Insertion_Sort {
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {7,5,9,2,6};
        for(int i = 1; i < a.length; i++ ){
            int current = a[i];
            int j = i - 1;
            while (j >=0 && current < a[j]) { 
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }
        display(a);
    }
}
