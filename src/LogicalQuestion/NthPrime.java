package LogicalQuestion;
import java.util.Scanner;

class NthPrime{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = findPrime(a);
        int y = findPrime(b);
        int result = (x * y)-1 ;
        System.out.println(result);

    }
    public static int findPrime(int n){

        int count = 0;
        int num = 2;
        for(num = 2; count < n; num++){

            if(isPrimeNum(num)){

                count++;
            }



        }

    return num-1;


    }
    static boolean isPrimeNum(int num) {
        for(int i = 2;i*i <= num;i++){

            if(num % i == 0)
                return false;
        }
        return true;
    }
    }
