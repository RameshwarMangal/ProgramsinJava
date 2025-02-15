package StringQuestions;
import java.util.Scanner;
public class EncryptDecrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter key:- ");
        int key = sc.nextInt();
        if (key < 0)
            System.out.println("Invalid Input");
        else {
            StringBuilder newStr = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    ch = (char) (ch + key);
                    if (ch > '9') {
                        int left = ch - '9';
                        ch = (char) ('0' + (left - 1));
                    }
                } else if (ch >= 'a' && ch <= 'z') {
                    ch = (char) (ch + key);
                    if (ch > 'z') {
                        int left = ch - 'z';
                        ch = (char) ('a' + (left - 1));
                    }
                } else if (ch >= 'A' && ch <= 'Z') {
                    ch = (char) (ch + key);
                    if (ch > 'Z') {
                        int left = ch - 'Z';
                        ch = (char) ('A' + (left - 1));
                    }
                }
                newStr.append(ch);
            }
            System.out.println(newStr.toString());
        }
    }
}