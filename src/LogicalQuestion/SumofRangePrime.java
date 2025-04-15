package LogicalQuestion;
import java.util.*;
public class SumofRangePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum =0;
        for(int i=n1;i<=n2;i++){
            int a=nthPrime(i);
            sum += a;
        }
        System.out.println(sum);
    }
    public static int nthPrime(int n){
        int count =0;
        int i=2;
        for(;count<n;i++){
            if(isPrime(i))
                count++;
        }
        return i-1;
    }
    public static boolean isPrime(int n){
        for(int i=2;i*i<= n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
