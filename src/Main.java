import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {2,2,4,4,3};


        System.out.println(solution.singleNumber(nums));
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int j = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }

        }
        return j;
    }
}