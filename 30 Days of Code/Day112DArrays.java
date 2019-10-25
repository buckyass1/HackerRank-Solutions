import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max = Integer.MIN_VALUE, sum;

        for(int row = 0; row < 4; row++){
            for(int col = 0; col < 4; col++){
                sum = arr[row+0][col+0] + arr[row+0][col+1] + arr[row+0][col+2]+
                arr[row+1][col+1]+arr[row+2][col+0]+arr[row+2][col+1]+arr[row+2][col+2];
                max = Math.max(sum, max);
            }
        }
        
        System.out.println(max);

        scanner.close();
    }
}
