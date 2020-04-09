package dp;

import java.util.Arrays;

/**
 * hint: Say f[i] is the final cost to climb to the top from step i.
 * 
 * Then f[i] = cost[i] + min(f[i+1], f[i+2]).
 * 
 * [10, 15, 20] then [final step]
 * 
 */
public class _746_MinCostClimbingStairs {

	public static int minCostClimbingStairs(int[] cost) {
		int n = cost.length;
		int[] dp = new int[n];

		dp[0] = cost[0];
		dp[1] = cost[1];

		for (int i = 2; i < n; i++) {
			dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
		}
		System.out.println(Arrays.toString(dp));
		return Math.min(dp[n - 1], dp[n - 2]);
	}

	public static void main(String[] args) {
//		int[] a = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
		int[] a = { 0, 0, 1, 1 };

		int res = minCostClimbingStairs(a);
		System.out.println(res);
	}
}
