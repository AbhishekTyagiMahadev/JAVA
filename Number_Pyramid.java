public class Number_Pyramid {
    public static void main(String[] args) {
        // for (int i = 1; i <= 15; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // // }
        // int m=5;
        // for (int i = 1; i <= m; i++) {
            
        //     for (int j = m-i; j > 0; j--) {
        //      System.out.print(" ");
        //     }
        //     for (int k = i; k >= 1; k--) {
        //      System.out.print(k);
        //     }
        //     for( int j = 2; j<=i; j++){
        //      System.out.print(j);
        //      }
        //     System.out.println();
        //  }
        int m = 5;
        for (int i = m; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
                System.out.println();
        }
    }
}
