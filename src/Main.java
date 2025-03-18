import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] flower = {"flower", "floor", "flord", "florida"};
//        solution.longestCommonPrefix(flower);
//        Arrays.sort(flower);
//        System.out.println(Arrays.toString(flower));
        solution.longestCommonPrefix(flower);

        System.out.println(solution.longestCommonPrefix(flower));


    }


}
class Solution {
    public String longestCommonPrefix(String[] strs) {

       Arrays.sort(strs);
       String s1 = strs[0];
       String s2 = strs[strs.length-1];
       int idx = 0;
       while(idx<s1.length()&& idx<s2.length()){
           if(s1.charAt(idx)==s2.charAt(idx)){
               idx++;
           }else {
               break;
           }

       }
       return s1.substring(0,idx);



    }
}
