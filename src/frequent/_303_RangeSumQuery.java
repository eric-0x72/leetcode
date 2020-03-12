package frequent;

import java.util.Arrays;

public class _303_RangeSumQuery {

	private int[] dp;

	public _303_RangeSumQuery(int[] nums) {

		if (nums.length == 0) // 注意判断是否是空
			return;

		dp = new int[nums.length];
		dp[0] = nums[0];

		for (int i = 1; i < nums.length; i++) {
			dp[i] = dp[i - 1] + nums[i];
		}
		System.out.println(Arrays.toString(dp));
	}

	public int sumRange(int i, int j) {

		int temp = 0;
		if (i >= 1)
			temp = dp[i - 1];

		return dp[j] - temp;
	}

	public static void main(String[] args) {

		int[] a = { -2, 0, 3, -5, 2, -1 };

		_303_RangeSumQuery obj = new _303_RangeSumQuery(a);
		int res = obj.sumRange(0, 2);
		System.out.println(res);
	}
}
