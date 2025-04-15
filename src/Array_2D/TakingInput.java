package Array_2D;
import java.util.*;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[][] arr = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Correct way to print a 2D array
        for (int i = 0; i < a; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

