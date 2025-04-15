//A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[il) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.
//        Example 1:
//        Input :
//        5 > Value of T
//        [7,0,5,1,3] -> EI, Element of E[0] to E[N-1], where input each element is separated by new line [1,2,1,3,4] > LI, Element of L[0] to L [N-1], while input each element is separate by new line.
//        Output :
//        8
//        -> Maximum number of guests on cruise at an instance.
package ArrayQuestions;
import java.util.*;
public class EnterLeave {
    int printResult(int entry[],int exit[],int t){
        int sum=0;
        int maxSum=0;
        for(int i=0;i<t;i++){
            sum=sum+entry[i]-exit[i];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time");
        int t =sc.nextInt();
        int entry[]={7,0,5,1,3};
        int exit[]={1,2,1,3,4};
        EnterLeave obj=new EnterLeave();
        System.out.println(obj.printResult(entry,exit,t));
    }
}
