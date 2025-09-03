// check array is shorted and strictly incresing 
import java.util.*;
public class Recursion9 {
    public static void check(int n, int[] arr) {
        if(n == arr.length-1){
            System.out.println("Array is sorted");
            return;
        }
        if(arr[n] < arr[n+1]){
            check(n+1, arr);
        }
        else{
            System.out.println("Array is not sorted");
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={3,5,9,10};
        // for (int i = 0; i < n; i++) {
        //    arr[i] = sc.nextInt();
        // }
        check(0, arr);
    }   
}
