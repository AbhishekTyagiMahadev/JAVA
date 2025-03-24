// Finding the subsequences
public class Recursion10{
    public static void subsequences(String str, int n, String newStr) {
        if( n == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(n);

        // to be
        subsequences(str, n+1, newStr+currChar);

        // not to be
        subsequences(str, n+1, newStr);
    }
    public static void main(String[] args) {
        String str = "abhishek";
        subsequences(str, 0, "");
    }
}
