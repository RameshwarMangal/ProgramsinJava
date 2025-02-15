package Hashmap;
import java.util.*;
public class CountSunday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day=sc.next();
        int numDay=sc.nextInt();
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Mon",6);
        map.put("Tue",5);
        map.put("Wed",4);
        map.put("Thu",3);
        map.put("Fri",2);
        map.put("Sat",1);
        map.put("Sun",0);
        int remTogetFirstS=numDay-map.get(day);
        int count = 0;
        if(remTogetFirstS > 0) {
            count++;
            if (remTogetFirstS >= 7) {
                count = count + (remTogetFirstS / 7);
            }
        }
        else if(remTogetFirstS == 0){
            count++;
            }
        System.out.println(count);
    }
}
