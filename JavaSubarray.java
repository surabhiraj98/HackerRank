import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int size     = scan.nextInt();
        int[] arr = new int[size];        
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        
        System.out.println(negativeSubarrays(arr));
    }
    
    private static int negativeSubarrays(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

