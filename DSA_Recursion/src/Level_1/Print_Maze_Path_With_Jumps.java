package Level_1;

import java.io.*;
import java.util.*;

public class Print_Maze_Path_With_Jumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1, 1, m, n, "");
        
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        //base call
        if(sr== dr && sc==dc){
            System.out.println(psf);
            return;
        }
        
        //Horizontal Call
        for(int jump=1; jump<=dc-sc; jump++){
            printMazePaths(sr, sc+jump, dr, dc, psf + "h" + jump);
        }
        
        //Vertical Call
        for(int jump=1; jump<=dr-sr; jump++){
            printMazePaths(sr+jump, sc, dr, dc, psf + "v" + jump);
        }
        
        //Diagonal Call
        for(int jump=1; jump<=dc-sc && jump <=dr-sr; jump++){
            printMazePaths(sr+jump, sc+jump, dr, dc, psf + "d" + jump);
        }
    }

}