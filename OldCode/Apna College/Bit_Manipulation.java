import java.util.*;
public class Bit_Manipulation {
    public static void main(String[] args){
        int n = 5, pos =2, bitMask = 1<<pos;
        //Get Bit
        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
        int num = ~(bitMask) & n;
        if((bitMask & num) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
