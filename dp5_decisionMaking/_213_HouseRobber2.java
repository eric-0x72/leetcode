package dp5_decisionMaking;

import java.util.Arrays;

/**
 * All houses are arranged in a circle
 *
 */
public class _213_HouseRobber2 {

	public static int rob(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);

		int n = nums.length;

		int[] dp1 = new int[n - 1]; // consider [0, n-2]
		dp1[0] = nums[0];
		dp1[1] = Math.max(dp1[0], nums[1]);

		for (int i = 2; i < n - 1; i++) {
			int consider = dp1[i - 2] + nums[i];
			int not = dp1[i - 1];
			dp1[i] = Math.max(consider, not);
		}
		int first = dp1[n - 2];

		// -------------------------------------------
		int[] dp2 = new int[n - 1]; // consider [1, n-1]
		dp2[0] = nums[1];
		dp2[1] = Math.max(dp2[0], nums[2]);
		for (int i = 2; i < n - 1; i++) {
			int consider = dp2[i - 2] + nums[i + 1];
			int not = dp2[i - 1];
			dp2[i] = Math.max(consider, not);
		}
		int second = dp2[n - 2];

		System.out.println(Arrays.toString(dp1));
		System.out.println(Arrays.toString(dp2));
		return Math.max(first, second);
	}

	public static void main(String[] args) {
		int a[] = { 1, 3, 1, 3, 100 };
		int res = rob(a);
		System.out.println(res);
	}
}
