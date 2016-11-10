mport java.io.*;
import java.util.*;

public class Solution {

    public static int Factorial(int n) {
        // Base case:
        if (n <= 0) {
            return 1;
        } else {
        //Recursive case:
            return n * Factorial(n-1);
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(Factorial(n));
    }
}
