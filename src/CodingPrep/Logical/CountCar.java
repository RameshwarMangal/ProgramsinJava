package CodingPrep.Logical;
import java.util.*;
public class CountCar{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of cars:- ");
        int v = sc.nextInt();
        System.out.println("Enter the number of wheels:- ");
        int w =sc.nextInt();
        if(v > w || w%2 !=0)
            System.out.println("Invalid Input");
        else{
            int fourWheelers =(w-2*v)/2;
            int twoWheelers =v-fourWheelers;
            System.out.println("The number of wheels is "+twoWheelers);
            System.out.println("The number of wheels is "+fourWheelers);
        }
    }
}
