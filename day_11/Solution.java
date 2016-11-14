import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int maxSum = Integer.MIN_VALUE;
        int runningSum;
        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        // Loop through (1,1) -> (4,4)
        
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 1; j < arr[i].length - 1; j++) {
                // Check 
                if ((arr.length > 6) || (arr[i].length > 6)) {
                    break;
                }
                // Reset running Sum
                runningSum = 0; 
                // Loop through neighbour skipping two of the neighbours to the left and right
                for (int a = -1; a <= 1; a++) { // -1, 0, 1
                    for (int b = -1; b <=1; b ++) { // -1, 0, 1
                        if (((a == 0) && (b == -1)) || ((a == 0) && (b == 1))) {/*Do nothing here*/}
                        else {
                            // sum up these remaining elements
                            runningSum += arr[i+a][j+b];
                        }
                    }
                }
                // Check if this is max sum
                if (runningSum > maxSum) {
                    maxSum = runningSum;     
                }
                
            }
        }
        System.out.println(maxSum);
    }
}

