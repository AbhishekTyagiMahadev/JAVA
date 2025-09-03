public class QuickSork {
    public static void main(String[] args) {
        int[] arr = {20, 5, 8, 9, 2, 36, 5, 35, 10};
        System.out.print("Orignal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sorting(arr, 0, arr.length-1);
        System.out.print("\nSorted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sorting(int[] arr, int low, int high) {
        if(low < high) {
            int pidx = partition(arr, low, high);
            sorting(arr, low, pidx-1);
            sorting(arr, pidx+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        
        for(int j = low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i]; 
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
}
