package com.jana;

public class FindMin {
    public static void main(String[] args) {
        int[] arr= {500,28,54,45,87};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min = arr[0];
        for(int i=1; i< arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }

        }
        return min;
    }
}
