import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6};

        System.out.println( linearSearch(arr, 1));

    }

    static boolean linearSearch(int[] arr,int target){
        if(arr.length==0)
        {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element==target){
                return true;
            }
        }
        return false;
    }

}







