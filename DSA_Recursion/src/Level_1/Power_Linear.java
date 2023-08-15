package Level_1;

import java.io.*;
import java.util.*;

public class Power_Linear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = power(x,n);
        System.out.println(result);
    }

    public static int power(int x, int n){
        //base case
        if(n==0){
            return 1;
        }
        int p = x * power(x,n-1);
        return p;
    }

}
