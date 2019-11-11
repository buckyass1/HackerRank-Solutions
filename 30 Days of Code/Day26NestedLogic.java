import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int day = scn.nextInt();
        int month = scn.nextInt();
        int year = scn.nextInt();

        int dayex= scn.nextInt();
        int monthex = scn.nextInt();
        int yearex = scn.nextInt();

        int fine = 0, difference = 0;

        if(year > yearex){
            fine = 10000;
        }
        else if(year < yearex){
            fine = 0;
        }
        else if(month > monthex){
            difference = month - monthex;
            fine = 500*difference;
        }
        else if(day > dayex){
            difference = day - dayex;
            fine = 15*difference;
        }
        System.out.println(fine);
        }
    }