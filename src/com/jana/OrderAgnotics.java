package com.jana;

public class OrderAgnotics {
    public static void main(String[] args) {
        int[] arr= {99,76,76,56,32};
        int target =76;
        int ans = orderAgnoticBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgnoticBS(int[] arr, int target){
        int start =0;
        int end = arr.length-1;


        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else {
            isAsc=false;
        }
        while(start<=end){
            int mid =start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end =mid-1;
                } else  {
                    start= mid+1;
                }
            }else {
                if(target>arr[mid]){
                    end = mid-1;
                }
                else {
                    start =mid+1;
                }
            }


        }
        return -1;
    }
}
