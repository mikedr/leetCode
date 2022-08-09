package main;

import buildArrayFromPermutation.Solution;

public class Main {

    public static void main(String[] args)
    {
    	int[] nums = {0,2,1,5,3,4};
    	Solution solution = new Solution();
    	int[] ans = solution.buildArray(nums);
    	System.out.print("{");
    	for(int i = 0; i < nums.length; i++) {
    		System.out.print(" "+ans[i]+",");
    	}
    	System.out.print("}");
    }

}
