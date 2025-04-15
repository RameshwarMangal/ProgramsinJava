package LogicalQuestion;
import java.util.Scanner;
public class SumOfNPrime {


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));

    }

    static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;

    }

    public static int printSum(int n) {
        int sum = 0;
        int count = 1;
        for (int i = 2; count <= n; i++) {
            if (isPrime(i)) {
                sum += i;
                count++;
            }
        }
        return sum;
    }
}
