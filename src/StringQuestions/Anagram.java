package StringQuestions;
import java.util.Scanner;
import java.util.Arrays;

class Anagram{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
            return;
        }

        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        while(i < arr1.length){
            if(arr1[i]==arr2[i]){
                i++;
            }
            else{
                System.out.println("Not Anagram");
                return;
            }

        }
        System.out.println("Anagram");

    }



}
