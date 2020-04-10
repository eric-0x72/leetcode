package frequent;

import java.util.Arrays;

public class __MaxSubarray {

	public static int maxSubArray(int[] nums) {
		if (nums.length == 0)
			return 0;

		int res = Integer.MIN_VALUE;
		int n = nums.length;

		for (int start = 0; start < n; start++) { // start = [0, n-1]
			for (int end = start; end < n; end++) { // end = [start, n-1]

				int temp = 0;
				for (int k = start; k <= end; k++) {
					temp += nums[k];
				}
				if (temp > res) {
					res = temp;
				}
			}
		}
		return res;
	}

	public static int maxSubArray_1(int[] nums) {
		int n = nums.length;
		int[] dp = new int[nums.length];
		dp[0] = nums[0];

		int cur = 0;
		int res = nums[0];

		for (int i = 1; i < n; i++) {
			if (dp[i - 1] <= 0) // if previous <=0, then we can ignore them
				cur = nums[i];
			else
				cur = dp[i - 1] + nums[i];

			dp[i] = cur;

			if (cur > res)
				res = cur;
		}

		return res;
	}

	public static void main(String[] args) {
//		int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//		int res = maxSubArray_1(a);
//
//		System.out.println("res = " + res);

		int original[] = { 1, 2, 3, 4 };
		int copy[] = original;

		original[0] = 78;
		System.out.println(Arrays.toString(copy));

	}

}
