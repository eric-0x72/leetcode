package dp;

import java.util.Arrays;

public class _45_JumpGame2 {

	public int jump(int[] nums) {
		int n = nums.length;
		int last = n - 1;

		// dp stores the minimum step from i to reach n-1
		int[] dp = new int[n];
		Arrays.fill(dp, n);
		dp[n - 1] = 0;

		for (int i = n - 2; i >= 0; i--) {

			int fur = Math.min(last, i + nums[i]);

			// stores the minimum jumps from j to n-1
			int min = n;
			for (int j = i + 1; j <= fur; j++) {
				min = Math.min(min, dp[j]);
			}

			// min jumps from j to n-1, plus 1 which is from i to j
			dp[i] = min + 1;
		}
		return dp[0];
	}

}
