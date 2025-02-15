//Sort one array according to another array
//        You are given two arrays all (integer) and bll (char). The ith value of all corresponds to the ith value of bl.
//        Sort the array b[] with respect to al].
//        Note: The output is whitespace and newline character sensitive. After every character print a whitespace character. Also do not print any newline character at any point.
//        Example 1:
//        Input:
//        al] = {3, 1, 2}
//        6 = {G, E, K'}
//        Output:
//        EKG
//        Explanation: Here 3 corresponds to G, 1 corresponds to E, 2 corresponds to 'K'


package Hashmap;
import java.util.*;
public class Question2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int n =sc.nextInt();
        int numArr[] = new int[n];
        char charArr[]=new char[n];
        System.out.println("Enter the numbers:- ");
        for(int i=0;i<n;i++){
            numArr[i]=sc.nextInt();
        }
        System.out.println("Enter the chareacters:- ");
        for(int i=0;i<n;i++){
            charArr[i]=sc.next().charAt(0);
        }
//        for(int i=0;i<n;i++)
//            System.out.println(numArr[i]);
//        for(int i=0;i<n;i++)
//            System.out.println(charArr[i]);
        HashMap<Integer,Character>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(numArr[i],charArr[i]);
        }
        System.out.println("The map is:");
//        System.out.println(map);
        Arrays.sort(numArr);
        for(int i=0;i<n;i++){
            System.out.println(map.get(numArr[i]));
        }

    }

}
