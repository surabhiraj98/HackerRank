import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

 boolean s = false;
            String w = "";
            Map < Character , Integer > Ma = new HashMap<>();
            Map< Character, Integer> Ma1 = new HashMap<>();
        
            for (int i = 0 ; i < s1.length(); i++){
                
                  
                Ma.put(s1.charAt(i) , 1);
            }
            for (int j = 0 ; j < s2.length(); j++){
                Ma1.put(s2.charAt(j) , 1);
            }
        
            for (Map.Entry<Character , Integer > entry : Ma.entrySet()){
                
                if (Ma1.get(entry.getKey()) != null ){
                    s = true;
                    break;
                }
                
            }
        if (s){
            w = "YES";
        }
        else {
            w = "NO";
        }
        return w;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
