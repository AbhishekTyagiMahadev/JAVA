public class PlaceTiles {
    public static void main(String[] args) {
        int n = 7, m = 2;
        System.out.println(placeTile(n, m));
    }
    public static int placeTile(int n, int m) {
        if(n == m)
            return 2;
        if(n < m)
            return 1;
        int v = placeTile(n-m, m);
        int h = placeTile(n-1, m);
        return v+h;
    }
}
