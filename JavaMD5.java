import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        try{
            MessageDigest md=MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            byte[] digest=md.digest();
            for(byte b:digest)System.out.printf("%02x",b);
        }catch(Exception e){}
    }
}


