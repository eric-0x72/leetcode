package dp;

import java.util.Arrays;

public class _55_JumpGame {

	// 1. backtracking with memo, top down DP
	// starting from 0, records if can we reach the last index
	static int[] memo;

	public static boolean canJump_1(int[] nums) {
		int n = nums.length - 1;

		memo = new int[nums.length];
		Arrays.fill(memo, -1); // -1 is unvisited
		memo[n] = 1; // 0 is false, 1 is true

		return helper(0, nums) == 1 ? true : false;
	}

	private static int helper(int index, int[] nums) {
		int last = nums.length - 1;

		if (index == last) // base case
			return 1;

		if (memo[index] != -1)
			return memo[index];

		// furtherest position can reach from index
		int fur = Math.min(index + nums[index], last);

		// i starts from next position index can reach, to the furtherest
		// if anyone reaches the last, then return true 1
		for (int i = index + 1; i <= fur; i++) {
			if (helper(i, nums) == 1) { // if i reaches the last
				memo[index] = 1;
				return 1;
			} else {
				continue;
			}
		}
		memo[index] = 0;
		return 0;
	}

	// 2. DP bottom up
	public static boolean canJump_2(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		Arrays.fill(dp, -1); // set all to unvisited
		dp[n - 1] = 1; // last is reachable

		for (int i = n - 2; i >= 0; i--) {

			// furtherest position reachable from i
			int fur = Math.min(n - 1, i + nums[i]);

			// examine all position j that is reachable to i
			in: for (int j = i; j <= fur; j++) {

				// if position j can reach last
				// then since i can reach j, i also can reach last, set i to 1
				// note: we set i to 1 for the first j that can reach last
				if (dp[j] == 1) {
					dp[i] = 1;
					break in;
				}
			} // inner
		} // outer
		return dp[0] == 1 ? true : false;
	}

	// 3. greedy
	public static boolean canJump_3(int[] nums) {
		int last = nums.length - 1;

		// 'last'; is the last position that can reach index n-1
		for (int i = last - 1; i >= 0; i--) {
			// if position i can reach n-1
			// then set last to i
			if (i + nums[i] > last) {
				last = i;
			}
		}
		return last == 0;
	}

	public static void main(String[] args) {
//		int[] a = { 2, 3, 1, 1, 4 };
//		boolean res = canJump_1(a);
//		System.out.println(res);
		int[] a = new int[12];
		System.out.println(Arrays.toString(a));
	}

}
