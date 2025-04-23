package com.jana;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,4,1},{18,12,3,9},{180,12}
        } ;
        int target = 20;
        System.out.println(max(arr));
    }
    
    static int[] search(int[][] arr, int target){
        if (arr.length==0){
            return new int[]{-1};
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                    if(arr[row][col]==target){
                        return new int[]{row,col};
                    }
            }
        }
        return new int[]{-1};
    }
    static int max(int[][] arr){
        if (arr.length==0){
            return -1;
        }

        int max =Integer.MIN_VALUE;
        for (int[] ints:arr) {
            for (int element: ints) {
                if(element>max){
                    max = element;

                }
            }
        }
        return max;
    }



}
