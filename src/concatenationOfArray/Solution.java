package concatenationOfArray;

public class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[(nums.length*2)];
        int i = 0;
        int j = 0;
        while(i<nums.length) {
            ans[i] = nums[i];
            i++;
            j++;
        }
        i=0;
        while(i<nums.length) {
            ans[j] = nums[i];
            i++;
            j++;
        }
        return ans;
    }
}