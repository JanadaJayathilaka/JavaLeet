package com.jana;


public class FirstAndLAstPosition {
    public static void main(String[] args) {
        int[] arr = {2,3,4,15,16,18,22,45};
        int target= 15;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
         int start =0;
         int end = 1;

         //condition
        while(arr[end]<target){
            int newStart= end +1;
            end = end+(end-start+1)*2;
            start =newStart;
        }
        return binarySearch(arr,target,start,end);
    }

     static int binarySearch(int[] arr, int target, int start, int end) {
    while(start<=end){
        int mid = start+(end-start)/2;

        if(target<arr[mid]){
            end= mid-1;
        }
        else if(target>arr[mid]){
            start = mid+1;
        }else{
            return mid;
        }
    }
return -1;
    }

    public int[] searchRange(int[] nums, int target) {

       int[] ans = {-1,-1};
        int start= search(nums,target,true);
        int end = search(nums,target,false);

        ans[0]=start;
        ans[1] =end;

        return ans;
    }

    static int search(int[] nums, int target,boolean findStartIndex){
        int ans =-1;

        int start= 0;
        int end = nums.length-1;

        while(start<=end){


            int mid = start+(end-start)/2;

            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
