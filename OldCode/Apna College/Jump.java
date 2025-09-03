public class Jump {
    public static void main(String[] args){
        // continue statement
        System.out.println("Continue Statement");
        for (int i = 1; i <= 10; i++) {
            if ( i % 2 != 0){
                continue;
            }   
            else{
                System.out.println(i);
            }
        }
        // Break statement
        System.out.println("Break Statement");
        int i = 1;
        while (true) { 
            if( i >= 11 ){
                break;
            }
            System.out.println( i );
            i++;
        }
    }
}
