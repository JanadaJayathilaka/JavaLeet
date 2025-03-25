import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
//        String sample = "ass";
        char[] chararr = A.toCharArray();

        int count = 0;
        for (int i = 0; i < A.length()/2; i++) {
            if(chararr[i]==chararr[A.length()-i-1]){
               count++;
            }

        }
        if (count==A.length()/2){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}



