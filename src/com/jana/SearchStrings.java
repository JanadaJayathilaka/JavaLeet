package com.jana;

public class SearchStrings {
    public static void main(String[] args) {
        int[] arr= {1,2,54,45,87};
        System.out.println(search3(arr,45,1,3));
    }
    static int search3(int[] arr,int target, int start,int end){
        if(arr.length==0){
            return -1;
        }
        for (int index = start;index<=end;index++){
            if(target == arr[index]){
                return index;
            }
        }
        return -1;
    }

    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;

            }
        }
        return false;
    }

}
