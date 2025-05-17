package Hashmap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class PrintMissingAlphabet {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s= s.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(ch >='a' && ch <='z')
                set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(char c = 'a'; c <='z';c++){
            if(!set.contains(c))
                sb.append(c);
        }
        if(sb.length() == 0)
            System.out.println(0);
        else System.out.println(sb.toString());
    }

}
