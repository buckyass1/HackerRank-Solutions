import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int a;
        double b;
        String c;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        a = scan.nextInt();
        b = scan.nextDouble();
        scan.nextLine(); // Gets rid of newline at end of line 2 of input 
        c = scan.nextLine();

        int sum = i + a;
        double sum1 = d + b;
        String sum2 = s + c;
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(sum);
        /* Print the sum of the double variables on a new line. */
        System.out.println(sum1);
        /* Concatenate and print the String variables on a new line; 
        the 's' variable above should be printed first. */
        System.out.print(sum2);
    
        scan.close();
    }
}