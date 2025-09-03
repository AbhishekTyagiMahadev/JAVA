class cal{
    public void sum(){
        System.out.println("Sum ="+ (a+b));
    }
    public void sub(int a,int b){
        System.out.println("Subtraction ="+ (a-b));
    }
    public void mul(int a,int b){
        System.out.println("Multiplication ="+ (a*b));
    }
}
class values extends cal{
    int a;
    int b;
    values(int num1,int num2){
        this.a = num1;
        this.b = num2;
    }
}
public class inher{
    public static void main(String args[]){
        values v = new values(20,30);
        v.sum();
        
    }
}