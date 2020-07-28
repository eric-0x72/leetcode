package array;

import java.math.MathContext;

public class _53_MaxSubarray {

	public int maxSubArray(int[] nums) {
		int n = nums.length;

		int[] dp = new int[n];
		dp[0] = nums[0];

		int res = nums[0];
		int cur = 0;

		for (int i = 1; i < n; i++) {
			if (dp[i - 1] <= 0) {
				cur = nums[i];
			} else {
				cur = dp[i - 1] + nums[i];
			}

			dp[i] = cur;
			res = Math.max(res, cur);
		}
		return res;
	}

	// learnt from solution zone
	public int maxSubArray2(int[] nums) {

		int n = nums.length;
		int res = nums[0];

		for (int i = 0; i < n; i++) {

			// if previous can contribute to current i position,
			// then update current position number
			if (nums[i - 1] > 0) {
				nums[i] += nums[i - 1];
			}

			res = Math.max(res, nums[i]);
		}
		return res;
	}

}
