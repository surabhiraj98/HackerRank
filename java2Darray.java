import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arri=0; arri < 6; arri++){
            for(int arrj=0; arrj < 6; arrj++){
                arr[arri][arrj] = scan.nextInt();
            }
        }
        Sum(arr);   
    }
    private  static void Sum(int arr[][]){
            //ROw
            int sum=-1000;
            for(int i =0 ; i<4;i++){
                for(int x =0 ; x<4; x++){
                    
                    int top = arr[i][x]+arr[i][x+1]+arr[i][x+2];
                    int middle = arr[i+1][x+1];
                    int bottom = arr[i+2][x]+arr[i+2][x+1]+arr[i+2][x+2];
                    if(top+middle+bottom>sum){sum=top+middle+bottom;}
                }
            }
            System.out.println(sum);
            
            
        }
}
 

