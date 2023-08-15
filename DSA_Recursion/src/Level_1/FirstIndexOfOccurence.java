package Level_1;
import java.util.*;

public class FirstIndexOfOccurence {
	   public static void main(String[] args) throws Exception {
	        // write your code here
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i<n; i++){
	            arr[i] = sc.nextInt();
	        }
	        
	        int x = sc.nextInt();
	        int result = firstIndex(arr, 0, x);
	        System.out.println(result);
	    }

	    public static int firstIndex(int[] arr, int idx, int x){
	        //base case
	        if(idx == arr.length){
	            return -1;
	        }
	        
	        if(arr[idx] == x){
	            return idx;
	        }
	        else{
	            int ans = firstIndex(arr, idx+1, x);
	            return ans;
	        }
	    }
}
