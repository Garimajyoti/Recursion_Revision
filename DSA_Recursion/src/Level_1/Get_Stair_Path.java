package Level_1;

import java.io.*;
import java.util.*;

public class Get_Stair_Path {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<String> list = getStairPaths(n);
    System.out.println(list);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        //base case
        if(n==0){
            ArrayList<String> zeroList = new ArrayList<>();
            zeroList.add("");
            return zeroList;
        }
        else if(n<0){
            ArrayList<String> negativeList = new ArrayList<>();
            return negativeList;
        }
        
        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);
        
        ArrayList<String> finalPath = new ArrayList<>();
        
        for(String path1: paths1){
            finalPath.add(1 + path1);
        }
        for(String path2: paths2){
            finalPath.add(2 + path2);
            
        }
        for(String path3: paths3){
            finalPath.add(3 + path3);
        }
        
        return finalPath;
    }

}