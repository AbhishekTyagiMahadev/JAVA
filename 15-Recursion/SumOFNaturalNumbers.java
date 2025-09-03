public class SumOFNaturalNumbers {
     public static void main(String[] args) {
        int num = 10; 
        int sum = 0;
        System.out.println("Sum of " + num + " Natural Number is: " + calculateSum(num, sum));
    }
    public static int calculateSum(int num, int sum) {
        if(num==0) {
            return sum;
        }
        sum += num;
        return (sum + calculateSum(num-1, sum));
    }
}z