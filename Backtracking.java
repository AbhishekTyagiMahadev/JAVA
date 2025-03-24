public class Backtracking {
    public static void display(String str, String perm, int n) {
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            display(newStr, perm + currChar, n+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        display(str, "", 0);
    }
}
