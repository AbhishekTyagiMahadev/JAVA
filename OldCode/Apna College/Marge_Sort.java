public class Marge_Sort{
    public static void Devide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        Devide(arr, si, mid);
        Devide(arr, mid+1, ei);
        Sorting(arr, si, mid, ei);
    }
    public static void Sorting(int arr[], int si, int mid, int ei){
        int newArr[] = new int[ei - si + 1];
        int n1 = si;
        int n2 = mid+1;
        int x = 0;
        while (n1 <= mid && n2 <= ei) { 
            if (arr[n1] <= arr[n2]) {
                newArr[x++] = arr[n1++];
            }else{
                newArr[x++] = arr[n2++];
            }
        }
        while (n1 <= mid) { 
            newArr[x++] = arr[n1++];
        }
        while (n2 <= mid) { 
            newArr[x++] = arr[n2++];
        }
        for(int i = 0, j = si; i < newArr.length; i++, j++) {
            arr[j] = newArr[i];
        }
    }
    public static void main(String[] args){
        int arr[] = {6,3,1,8,9,10};
        int n = arr.length;
        Devide(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}