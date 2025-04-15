package Hashmap;
import java.util.*;
public class FindRank {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        int rank= 1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=arr.clone();
        Arrays.sort(arr1);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i],rank);
                rank++;
            }
        }
        for(int i= 0;i <n;i++){
            System.out.println(map.get(arr[i]));
        }

    }

}
