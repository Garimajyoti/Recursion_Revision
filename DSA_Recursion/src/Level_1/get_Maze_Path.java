package Level_1;

import java.io.*;
import java.util.*;

public class get_Maze_Path {

    public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    ArrayList<String> list = getMazePaths(1, 1, n, m);
    System.out.println(list);
    
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        //base case
        if(sr == dr && sc == dc){
            ArrayList<String> returnList = new ArrayList<>();
            returnList.add("");
            return returnList;
        }
        
        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();
        
        if(sc<dc){
             hpaths = getMazePaths(sr, sc+1, dr, dc);
        }
        
        if(sr<dr){
             vpaths = getMazePaths(sr+1, sc, dr, dc);
        }
        
        ArrayList<String> result = new ArrayList<>();
        for(String hpath : hpaths){
            result.add("h" + hpath);
        }
        for(String vpath: vpaths){
            result.add("v" + vpath);
        }
        
        return result;
        
    }

}