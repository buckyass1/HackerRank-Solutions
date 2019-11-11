import java.io.*;
import java.util.*;

public class Solution {
    public static String isPrime(int number){
        if(number != 2 && number % 2 == 0 || number < 2){
            return "Not prime";
        }
        int sqrt = (int) Math.sqrt(number);
        for(int i = 3; i <= sqrt; i+=2){
            if(number % i == 0){
                return "Not prime";
            }
        }
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int T = scn.nextInt();
        while(T >= 1){
            int number = scn.nextInt();
            System.out.println(isPrime(number));
            T--;
        }
    }
}