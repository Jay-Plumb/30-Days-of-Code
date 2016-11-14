import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
     
        
        while(scan.hasNextLine()) {
            //if (t >= 1 && t <= 10) {
                // Convert string to char array
                String string = scan.nextLine();
               
                // Convert each string to char array
                char[] charString = string.toCharArray();
                // check if each string is between 2-10000
                if (charString.length >= 2 && charString.length <= 10000) {
                    String s1 = "";
                    String s2 = "";
                    for (int i = 0; i < charString.length; i+=2) {
                        System.out.print(charString[i]);
                    }
                    
                    System.out.print(" ");
                    for (int i = 1; i < charString.length; i+=2) {
                        System.out.print(charString[i]);
                    }
                    
                    System.out.println();
                }
            //}
            
        }
        
     
        
    }
}
