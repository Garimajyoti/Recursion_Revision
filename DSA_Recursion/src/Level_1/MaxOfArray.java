package Level_1;
import java.util.*;
public class MaxOfArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        
        int result = maxOfArray(arr, 0);
        System.out.println(result);
    }

    public static int maxOfArray(int[] arr, int idx){
        //base case
        if(idx == arr.length){
            return -1;
        }
        int a = maxOfArray(arr, idx+1);
        int b = Math.max(a, arr[idx]);
        return b;
        
    }
}
