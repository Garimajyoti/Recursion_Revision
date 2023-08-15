package Level_1;
import java.util.*;

public class DisplayArrayInReverse {
	public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        displayArrReverse(arr, 0);
        
    }

    public static void displayArrReverse(int[] arr, int idx) {
        //base case
        if(idx == arr.length){
            return;
        }
        displayArrReverse(arr, idx+1);
        System.out.println(arr[idx]);
        

    }

}
