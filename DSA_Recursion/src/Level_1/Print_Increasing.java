package Level_1;

import java.io.*;
import java.util.*;

public class Print_Increasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        //base case
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
        
    }

}