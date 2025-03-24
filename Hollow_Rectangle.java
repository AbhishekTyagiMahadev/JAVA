public class Hollow_Rectangle {
    public static void main(String[] args) {
        int m = 5, n = 10 , i, j;
        for ( i = 0; i < m; i++) {
            for ( j = 0; j < n; j++) {
                if( i==0 || i==m-1 || j==0 ||j==n-1){

                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
