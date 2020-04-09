package dp3_mergeIntervals;

import java.util.Arrays;

public class _1130_MinCostTreeFromLeafValues {

	public static int mctFromLeafValues(int[] arr) {
		int n = arr.length;

		int[][] max = new int[n][n];
		for (int i = 0; i < n; i++) { // start [0, n-1]
			int temp = arr[i];

			for (int j = i; j < n; j++) { // end [i, n-1]
				temp = Math.max(temp, arr[j]);
				max[i][j] = temp;
			}
		}

		int[][] dp = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				dp[i][j] = Integer.MAX_VALUE;

		// leaf node gives 0, interval [i,i]
		for (int i = 0; i < n; i++)
			dp[i][i] = 0;

		// length decides the length of current interval, under examination
		// increase length of interval so as to push towards final answer
		for (int length = 1; length < n; length++) { // length
			for (int l = 0; l < n - length; l++) { // start

				int r = l + length; // end = start + length

				// enumerate mid point
				for (int m = l; m < r; m++) { // [l, r-1]
					dp[l][r] = Math.min(dp[l][r],
							// [l,m] and [m+1,r]
							// base case: 0 + 0 + l*r
							dp[l][m] + dp[m + 1][r] + max[l][m] * max[m + 1][r]);
				}
			}
		}
		return dp[0][n - 1];
	}

	public static void main(String[] args) {

		int[] a = { 6, 2, 4 };
		int res = mctFromLeafValues(a);
		System.out.println(res);
	}

}
