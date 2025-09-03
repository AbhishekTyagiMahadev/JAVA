import java.util.*;

public class Selection_Short {
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {7,5,9,2,6};
        for(int i = 0; i < a.length - i; i++ ){
            int smallest = i;
            for (int j = i+1 ; j < a.length; j++) {
                if(a[smallest] > a[j])
                    smallest = j;
            }
            int temp = a[smallest];
            a[smallest] = a[ i ];
            a[ i ] = temp;
        }
        display(a);
    }
}
