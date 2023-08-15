package Level_1;

import java.io.*;
import java.util.*;

public class Print_ZigZag {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        //base case
        if(n==0){
            return;
        }
        
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
        pzz(n-1);
        System.out.print(n);
          
    }

}