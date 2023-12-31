package Level_1;

import java.io.*;
import java.util.*;

public class Print_Stair_Paths {

    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printStairPaths(n, "");
    }

    public static void printStairPaths(int n, String path) {
        //base case
        if(n == 0){
            System.out.println(path);
            return;
        }else if(n < 0){
            return;
        }
        
        printStairPaths(n-1, path + "1");
        printStairPaths(n-2, path + "2");
        printStairPaths(n-3, path + "3");
    }

}