import java.io.*;
import java.util.*;

public class Solution {
    
    private static String binaryRepresentation(int dec) {
        return Integer.toBinaryString(dec);
    }
    
  
    private static int countConsecutiveOnes(String binary) {
        // Convert to char array 
        char[] binaryCharArray = convertToCharArr(binary); 
        int maxCountLength = 0;
        int currentCount = 0;
        
        for (int i = 0; i < binaryCharArray.length; i++) {
            // Convert the char array elements to int 
            int binaryDigitRepresentation = Character.getNumericValue(binaryCharArray[i]);
            if (binaryDigitRepresentation == 1) {
                currentCount++;
                if (maxCountLength < currentCount ) {
                    maxCountLength = currentCount;
                }
            } else {
              // Check if currentCount is larger than previous max 
                currentCount = 0;
            }
        }
        return maxCountLength;
    }
    
    private static char[] convertToCharArr(String binary) {
        return binary.toCharArray();
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int decimal = scan.nextInt();
        // Convert decimal to binary of strings
        if (decimal >= 1 && decimal <= 10000000) {
            String binary = binaryRepresentation(decimal);
            int count = countConsecutiveOnes(binary);
            System.out.println(count);
        }
    }
}
