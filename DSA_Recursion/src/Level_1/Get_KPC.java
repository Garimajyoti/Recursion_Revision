package Level_1;

import java.io.*;
import java.util.*;

public class Get_KPC {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    ArrayList<String> result = getKPC(s);
    System.out.println(result);
    }
    
    
    static String[] words = {",;", "abc", "def", "ghi", "jkl", ",mno", "pqrs","tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str) {
        //base case
    	if(str.length() == 0){
            ArrayList<String> emptyRes = new ArrayList<>();
            emptyRes.add("");
            return emptyRes;
            
        }
        
        //678
        char first = str.charAt(0); //6
        String ros = str.substring(1); //78
        ArrayList<String> res = getKPC(ros);
        
        ArrayList<String> finalAns = new ArrayList<>();
        String word = words[first - '0'];
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            for(String it: res){
            	finalAns.add(ch + it);
            }
        }
        
        return finalAns;
        
    }

}