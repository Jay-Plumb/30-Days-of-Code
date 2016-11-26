import java.io.*;
import java.util.*;

public class Solution {
    
    private static boolean isPrime(int n) {
       if (n == 1) {
           return false;
       }
       for (int i = 2; i <= Math.sqrt(n); i++) {
           if ((n % i) == 0) {
               return false;
           }
       }
       return true;
    }

    private static void printResult(boolean prime) {
        if (prime) {
           System.out.println("Prime");
       } else {
           System.out.println("Not prime");  
       }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        if (t >= 1 && t <= 30) {
            while(scan.hasNextInt()) {
                int n = scan.nextInt();
                boolean res = isPrime(n);
                printResult(res);
            }
        }
    }
}

