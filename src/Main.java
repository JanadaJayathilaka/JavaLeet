import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] number = {-1,2,3,4,-3,-4,-8,-7};
        System.out.println(solution.maximumCount(number));

    }

    static class Solution {
        public int maximumCount(int[] nums) {
            int neg = 0;
            int pos = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]<0){
                    neg++;
                }else if(nums[i]>0){
                    pos++;
                }
            }
            if(neg<=pos){
                return pos;
            }else {
                return neg;
            }

        }
    }


}


