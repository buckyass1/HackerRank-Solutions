import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    // Add your code here
  	private int[] elements;
  	public int maximumDifference;
    public int dif;

    public Difference(int[] arr){
            this.elements = arr; 
    }

    void computeDifference(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int a = 0; a < elements.length; a++){
            if(max < elements[a]){
                max = elements[a];
            }
            if(min > elements[a]){
                min = elements[a];
            }
            maximumDifference = max - min;
        }
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}