package BegginJava;
import java.util.Scanner;
public class InputTaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("Enter an floating-point number: ");
        float x = sc.nextFloat();
        System.out.println("Enter an String: ");
        String s = sc.next();
        System.out.println(n);
        System.out.println(x);
        System.out.println(s);
    }
}
