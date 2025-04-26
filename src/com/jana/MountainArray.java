package com.jana;

public class MountainArray {
    public static void main(String[] args) {

    }

    int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnoticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }

        return orderAgnoticBS(arr,target,peak+1,arr.length-1);

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start =0;
        int end = arr.length-1;


        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            } else if (arr[mid]<arr[mid+1]) {
                start=mid+1;
            }
        }

        return start;
    }

    static int orderAgnoticBS(int[] arr, int target,int start, int end){

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
