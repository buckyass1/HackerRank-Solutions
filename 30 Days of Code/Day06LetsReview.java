import java.io.*;
import java.util.*;

public class Solution {

    public static void evenOdd(String str){
        String even = "", odd = "";
        for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0){
                even = even + str.charAt(i);
            }
            else{
                odd = odd + str.charAt(i);
            }
        }
        System.out.println(even + " " + odd);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for(int i = 0; i < n; i++){
            String str = scn.next();
            evenOdd(str);
        }