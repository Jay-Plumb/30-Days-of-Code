mport java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        // Print in reverse
        if (n  >= 1 && n <= 1000) {
            for (int i = arr.length - 1; i >= 0; i-- ) {
                if (arr[i] >= 1 && arr[i] <= 10000) {
                    System.out.print(arr[i] + " ");
                }
            }
            
        }
        
        in.close();
    }
}

