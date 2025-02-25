import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {2,2,4,4,3};


        System.out.println(solution.singleNumber(nums));
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int a = 0;
        if(nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i+=2) {
            if(nums[i]!= nums[i+1]){
                a= nums[i];
                return a;
            }
        }
        return nums[nums.length-1];
    }
}