import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner cin=new Scanner(System.in);
        try{
            int x=cin.nextInt(),y=cin.nextInt();
            System.out.println(x/y);
        }catch(InputMismatchException e){
            System.out.println(e.getClass().toString().substring(6));
        }catch(Exception e){
            System.out.println(e);
        }
    }   
    }


