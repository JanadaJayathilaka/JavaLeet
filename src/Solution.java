import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        System.out.println(isArmsorNot(153));




    }
    static boolean isArmsorNot(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum+= rem*rem*rem;
        }

        if(sum==original){
            return true;
        }
        else
            return false;
    }

}







