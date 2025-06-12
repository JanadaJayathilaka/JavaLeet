import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={4,3,20,1,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the max and swap with correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);

            swap(arr,maxIndex,last);
        }

    }

    private static int getMaxIndex(int[] arr, int start,int end){
        int max =start;

        for (int i =start; i <=end ; i++) {

            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] =arr[second];
        arr[second] =temp;
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped =false;
            //for each step max item will come to last index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    swap(arr,j-1,j);
                    swapped=true;
                }

            }
            if(swapped==false){
                break;
            }


        }
    }
}
