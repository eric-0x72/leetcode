package DP;

import java.util.Arrays;

import sun.jvm.hotspot.utilities.memo.MemoizedBoolean;

/**
 * @author zwb
 * 
 *         classic LIS problem
 * 
 *         subsequence does not need to be continuous
 * 
 */
public class _300_LongestIncreasingSubsequence {

	/**
	 * brute force, time limit exceed
	 * 
	 * time complexity: O(2^n) ; space complexity: O(n)
	 * 
	 */
	public int lengthOfLIS_0(int[] nums) {
		return dfs(nums, Integer.MIN_VALUE, 0);
	}

	// pre is the value of previous element
	private int dfs(int[] nums, int pre, int cur) {
		if (cur == nums.length)
			return 0;

		int include = 0;
		// if num[cur] is greater than previous element, then we can take cur
		// pass nums[cur] as the next pre element in dfs function
		if (nums[cur] > pre)
			include = 1 + dfs(nums, nums[cur], cur + 1);

		// not take cur, so next level dfs, pre does not change
		int not = dfs(nums, pre, cur + 1);

		return Math.max(include, not);
	}

	/**
	 * top down DP
	 * 
	 */
	int[][] dp;

	public int lengthOfLIS_1(int[] nums) {
		dp = new int[nums.length + 1][];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}

	}

	private int lengthOfLIS_1(int[] nums, int pre, int cur) {
		if (cur == nums.length)
			return 0;
		if (dp[pre + 1][cur] != -1)
			return dp[pre + 1][cur];
		int include = 0;
		if (pre < 0 || nums[cur] > nums[pre])
			include = lengthOfLIS_1(nums, cur, cur + 1);

	}

	/**
	 * bottom up DP
	 * 
	 */
	public static int lengthOfLIS_2(int[] nums) {
		if (nums.length == 0)
			return 0;

		// LIS ending with i-th element
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);

		for (int i = 1; i < nums.length; i++) { // end i
			for (int j = 0; j < i; j++) { // start j
				if (nums[j] < nums[i])
					dp[i] = Math.max(dp[i], 1 + dp[j]);
			}
		}
		// System.out.println(Arrays.toString(dp));

		// find the max element in dp array
		int res = 1;
		for (int i = 0; i < dp.length; i++) {
			res = Math.max(res, dp[i]);
		}
		return res;
	}

	public static void main(String[] args) {
		// int a[] = { 10, 9, 2, 5, 3, 7, 101, 18 };
		// int a[] = { 9, 8, 7, 6, 5, 1, 2, 3, 9, 8, 7 };
		int a[] = { 1, 3, 6, 7, 9, 4, 10, 5, 6 };
		int res = lengthOfLIS_2(a);
		System.out.println(res);
	}
}
