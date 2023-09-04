package Level_1;


import java.io.*;
import java.util.*;

public class Print_Permutations {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String asf) {
        //base case
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);   //if left = str.substring(0,0) it will return empty string
            String right = str.substring(i+1);
            String ros = left + right;
            printPermutations(ros, asf+ch);
        }
    }

}
