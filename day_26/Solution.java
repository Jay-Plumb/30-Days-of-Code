import java.io.*;
import java.util.*;

public class Solution {

    private static int fine(int[] data) {
        // Small fine
        /* [0, 1, 2, 
        *   3, 4, 5]
        */
        if ( ((data[0] - data[3]) >= 0) && ((data[1] - data[4]) == 0) && (data[2] == data[5]) ) {
            // Days late
            return 15 *(data[0] - data[3]);
        } 
        else if ((data[1] - data[4]) > 0 && (data[2] == data[5]) ) {
            // One month or more late
            return 500 * (data[1] - data[4]);
        } else if ( (data[2] - data[5]) > 0 ) {
            // Over one year late
            return 10000;
        } else {
            return 0; // shouldnt occur
        }
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        // Store the data in a 1D array for convenience
        int[] data = new int[6]; 
        
        // Store data
        for (int i = 0; i < data.length; i++) {
            data[i] = scan.nextInt();
        }
        
        
        System.out.println(fine(data));
    }
}
