package Hashmap;
import java.util.Scanner;
import java.util.*;
import java.util.HashMap;

class LetterFreq{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : str.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                map.put(ch,map.getOrDefault(ch, 0)+1);
            }
        }
        for(char ch : map.keySet())
            System.out.println(ch +": "+ map.get(ch));
    }

}