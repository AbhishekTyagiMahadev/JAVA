public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {20, 5, 8, 9, 2, 36, 5, 35, 10};
        int start = 0;
        int end = arr.length - 1;
        System.out.print("Orignal: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        devide(arr, start, end);
        System.out.print("\nSorted: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void devide(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int mid = (start + end)/2;
        devide(arr, start, mid);
        devide(arr, mid+1, end);
        marge(arr, start, mid, end);
    }

    public static void marge(int[] arr, int start, int mid, int end) {
        if (start >= end) {
            return;
        }
        int[] newArr = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int temp = 0;
        while (i <= mid && j <= end) {
            if (arr[i] >= arr[j]) {
                newArr[temp++] = arr[j++];
            } else {
                newArr[temp++] = arr[i++];
            }
        }
        
        while(i <= mid) {
            newArr[temp++] = arr[i++];
        }

        while(j <= end) {
            newArr[temp++] = arr[j++];
        }

        for(int x = 0, y = start; x < newArr.length; x++, y++) {
            arr[y] = newArr[x];
        }
    }
}
