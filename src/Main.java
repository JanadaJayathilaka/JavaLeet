import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(-121));

    }
}
class Solution {
    public boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        char[] charArray = xString.toCharArray();


        int[] arr1 = new int[charArray.length];
        int[] arr2 = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {

                arr1[i] = charArray[i]-'0' ;



        }
        int k = 0;
        for(int j = charArray.length-1;j>=0;j--){
            arr2[k] = arr1[j];
            k++;
        }

        return Arrays.equals(arr1,arr2);


    }
}