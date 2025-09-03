import java.util.*;
public class solution{ 
    public static void eligible(int age){
        if(age>18){
            System.out.print("eligible for vote");
        }
        else{
            System.out.print("not eligible");
        }
    }
        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter your age");
            int age=sc.nextInt();
            eligible(age);
        }

    
}
