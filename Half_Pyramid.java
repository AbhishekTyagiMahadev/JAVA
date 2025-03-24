public class Half_Pyramid {
        public static void main(String[] args){
            // for (int i = 1; i <= 5; i++) {
            //     for( int j = 1; j<=i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            int m = 20;
            for (int i = 1; i <= m; i++) {
            
               for (int j = m-i; j > 0; j--) {
                System.out.print(" ");
               }
               for (int k = 1; k <= i; k++) {
                System.out.print("*");
               }
               for( int j = 2; j<=i; j++){
                System.out.print("*");
                }
               System.out.println();
            }
           
        }
}
