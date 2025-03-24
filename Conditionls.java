public class Conditionls {
    public static void main(String[] args){
        int a = 5;
        int b = 9;
        int c = 7;
        if( a>b && a>c){
            System.out.print(a+" is greatest");
            if(a%2 == 0){
                System.out.print(" and even");
            }
            else{
                System.out.print(" and odd");
            }
        }
        else if( b>a && b>c){
            System.out.print(b+" is greatest");
            if(b%2 == 0){
                System.out.print(" and even");
            }
            else{
                System.out.print(" and odd");
            }
        }
        else{
            System.out.print(c+" is greatest");
            if(c%2 == 0){
                System.out.print(" and even");
            }
            else{
                System.out.print(" and odd");
            }
        }
    }
}