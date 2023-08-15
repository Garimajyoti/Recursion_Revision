package Level_1;

import java.io.*;
import java.util.*;

public class Print_KPC {

    public static void main(String[] args) throws Exception {
    Scanner sc  = new Scanner(System.in);
    String str = sc.next();
    printKPC(str, "");
    }

    static String[] words = {",;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKPC(String str, String asf) {
        //base case
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);
        
        String word = words[ch - '0'];
        
        for(int i=0; i<word.length(); i++){
            char newChar = word.charAt(i);
            printKPC(ros, asf + newChar);
        }
        
    }

}