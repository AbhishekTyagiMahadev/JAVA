public class MazePath {
    public static void main(String[] args) {
        int n = 30, m = 13;
        int count = countPath(0, 0, n, m);
        System.out.println("Paths: " + count);
    }
    public static int countPath(int i, int j, int n, int m) {
        if(i == n || j == n)
            return 0;
        if(i == n-1 && j == m-1)
            return 1;
        int down = countPath(i+1, j, n, m);
        int right = countPath(i, j+1, n, m);
        return down+right;
    }
}
