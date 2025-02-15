package Hashmap;
import java.util.*;
public class First {
    public static void main(String args[]){
//        Hashmap<String, Integer>map = new Hashmap<>();
        HashMap<String,Integer>map = new HashMap<>();//Defining a hashmap
        map.put("a",1);//inserting value into it
        map.put("b",2);
        map.put("c",3);
//        System.out.println(map.get("a"));//printing the value
//        System.out.println(map.containsKey("a"));//checks if it is in the db or not
        HashSet<String> set = new HashSet<>();//Defining a hasset
//        set.add(4);//adding value into it
//        set.add(5);
//        set.add(6);
//        set.add(4);
        set.add("a");
        set.add("b");
        set.add("a");
        set.add("abc");
        System.out.println(set);
    }
}
