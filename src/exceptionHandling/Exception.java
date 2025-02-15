package exceptionHandling;

public class Exception {
    public static void main(String[] args) {
        int a =5;int b=0;
        try{
            devide(a,b);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Always run");
        }
    }
    static int devide(int a,int b) throws ArithmeticException{
        if(b==0)
            throw new ArithmeticException("Division by zero is not possible");
        return a/b;
    }
}
