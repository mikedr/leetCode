package main;

import concatenationOfArray.Solution;

public class Main {

    public static void main(String[] args)
    {
    	int[] nums = {1,2,3,4};
    	Solution solution = new Solution();
    	int[] ans = solution.getConcatenation(nums);
    	System.out.print("{");
    	for(int i = 0; i < ans.length; i++) {
    		System.out.print(" "+ans[i]+",");
    	}
    	System.out.print("}");
    }

}
