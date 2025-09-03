import java.util.Scanner;
public class CheckShortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 8, 8};
        checkArray(arr, 0, true, true);
    }
    public static void checkArray(int[] arr, int i, boolean sorted, boolean strictlyIncreasing) {
        if(i == arr.length-1) {
            if(sorted == false) {
                System.out.println("Array is not sorted.");
            }  else {
                System.out.println("Array is sorted.");
            }
            if(strictlyIncreasing == false) {
                System.out.println("Array is not strictly increasing.");
            } else {
                System.out.println("Array is sorted and strictly increasing.");
            }
            return;
        }
        if (arr[i] > arr[i+1]) {
            sorted = false;
        }
        if(arr[i] >= arr[i+1]) {
            strictlyIncreasing = false;
        }
        checkArray(arr, i+1, sorted, strictlyIncreasing);
    }
}
