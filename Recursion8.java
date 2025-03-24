//Find the first and last occurance of an element in string
import java.util.*; 
 public class Recursion8{
    public static int first = -1;
    public static int last = -1;
    public static void searchString(int n, String str, char element) {
        if(n == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char curr = str.charAt(n);
       if( curr == element){
            if(first == -1){
                first = n;
            }
            else{
                last = n;
            }
       }
       searchString(n+1, str, element);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        searchString(0, str, 'a');
    }
}
