package dp5_decisionMaking;

public class _198_HouseRobber {

	public int rob(int[] nums) {
		int n = nums.length;

		if (n == 0)
			return 0;
		if (n == 1)
			return nums[0];

		int[] dp = new int[n];

		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);

		for (int i = 2; i < n; i++) {
			// making decision of whether to steal house i
			int consider_i = dp[i - 2] + nums[i];
			int not_consider_i = dp[i - 1];

			dp[i] = Math.max(consider_i, not_consider_i);
		}
		return dp[n - 1];
	}
}
