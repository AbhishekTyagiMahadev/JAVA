public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 3, 1, 9, 1, 5, 0};

        System.out.print("Orignal Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }

        System.out.print("\nSorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }   
}
