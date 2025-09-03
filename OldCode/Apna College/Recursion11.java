
public class Recursion11 {
    public static int countPaths(int i, int j, int n, int m) {
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        // move down
        int down = countPaths(i+1, j, n, m);
        // move right
        int right = countPaths(i, j+1, n, m);
        return down + right;
    }
    public static void main(String args[]){
        int n = 400, m = 150;
        int ans = countPaths(0, 0, n, m);
        System.out.println(ans);
    }
}
