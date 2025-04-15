package StringQuestions;
import java.util.Scanner;

public class CountNumOfSubsString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count =0;
        System.out.println("Enter the length: ");
        int n = sc.nextInt();
        System.out.println("Enter the String: ");
        String s=sc.next();
        for(int i = 0; i < s.length();i++) {
            int sum = 0;
            for(int j = i;j < s.length();j++) {
                sum +=s.charAt(j) -'0';
                if(sum != j-i+1)
                    count++;
            }
        }
        System.out.println(count);
    }
}
