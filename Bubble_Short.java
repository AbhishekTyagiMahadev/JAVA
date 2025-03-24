public class Bubble_Short{
    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int a[] = {7,5,9,2,6};
        for(int i = 0; i < a.length - i; i++ ){
            for (int j = 0; j < a.length - i - 1; j++) {
                if(a[j] > a[ j + 1]){
                    int temp = a[ j ];
                    a[ j ] = a[ j + 1];
                    a[ j + 1 ] = temp;
                }
            }
        }
        display(a);
    }
}