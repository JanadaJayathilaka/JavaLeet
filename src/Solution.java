import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);


        int[][] arr = new int[3][2];
        System.out.println(arr.length);

        for(int row = 0;row<arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] =in.nextInt();
            }
        }

        for(int row = 0;row<arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col]);
            }
        }


    }


}







