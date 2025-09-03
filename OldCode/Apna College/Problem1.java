public class Problem1{
    public static void main(String[] args){
        int array[] = { 12,5,23,19,8};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println( even + " even numbers in array");
        System.out.println( odd + " odd numbers in array");
    }
}