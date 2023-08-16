package Level_1;

import java.io.*;
import java.util.*;

public class Print_Subsequence {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    printSS(str, " ");
    }

    public static void printSS(String str, String ans) {
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        printSS(ros, ans + "");
        printSS(ros, ans +  ch);
       
        
    }

}
