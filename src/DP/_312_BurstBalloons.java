package dp;

import java.util.Arrays;

public class _312_BurstBalloons {

	public static int maxCoins(int[] nums) {
		int n = nums.length;

		int len = n + 2;
		int[] a = new int[len];

		// src, srcPos, dest, destPos, int length
		System.arraycopy(nums, 0, a, 1, n);
		a[0] = 1;
		a[len - 1] = 1;

		int[][] dp = new int[len][len];

		for (int gap = 2; gap < len; gap++) {

			for (int l = 0; l < len - gap; l++) {

				// right bound
				int r = l + gap;

				// inside [l, r]
				for (int i = l + 1; i < r; i++) {
					dp[l][r] = Math.max(dp[l][r], a[l] * a[i] * a[r] + dp[l][i] + dp[i][r]);
				}
			} // end left for
		} // end gap for
		
		System.out.println(Arrays.deepToString(dp));
		System.out.println(dp[0][len - 1]);
		return dp[0][n - 1];
	}

	public static void main(String[] args) {
		int a[] = new int[] { 3, 8 };
		int res = maxCoins(a);
		System.out.println(res);
	}
}
