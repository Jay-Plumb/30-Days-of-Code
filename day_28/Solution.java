import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in).useDelimiter("\\n"); // added the delimeter because the default token is " "
        int n = scan.nextInt();
        String delimeter = " "; 
        Pattern p = Pattern.compile("@gmail"); //gmail
        LinkedList<String> names = new LinkedList<String>();
        
        while (n >= 2 && n <= 30 && scan.hasNext()) {
            // System.out.println(scan.next());
            String[] line = scan.next().split(delimeter);
            // Check for "@gmail.com" in the password field and print the corresponding name if match is found
            Matcher m = p.matcher(line[1]);
            if (m.find()) {
                names.add(line[0]);
                //System.out.println(line[0]); 
                // Store the output so we can order it 
                
            }
        }
        
        // Sort in alphabetical order 
        Collections.sort(names);
        for (String item : names) {
            System.out.println(item);    
        }
           
    }
}
