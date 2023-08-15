package Level_1;

import java.io.*;
import java.util.*;

public class GetSubsequence {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    String string = sc.next();
    ArrayList<String> list = gss(string);
    System.out.println(list);
    }

    public static ArrayList<String> gss(String str) {
        //base case
        if(str.length() == 0){
            ArrayList<String> anotherList = new ArrayList<>();
            anotherList.add("");
            return anotherList;
        }
        
        char ch = str.charAt(0); //a
        String ros = str.substring(1); //bc
        ArrayList<String> result = gss(ros);
        
        ArrayList<String> newList = new ArrayList<>();
        for(String it: result){
            newList.add(""+it);
        }
        
        for(String it:result){
            newList.add(ch+it);
        }
        
        return newList;
        
    }

}