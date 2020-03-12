package DP;

import java.util.Arrays;

public class __RodCutting {

	// -------------------- naive recursion top down --------------------------
	public static int cut_recursion(int[] prices, int n) {
		if (n == 0)
			return 0;

		int res = Integer.MIN_VALUE;
		// res = prices[length];

		for (int i = 1; i <= n; i++) { // i = length��Ӧ���ǲ��з֣�res = prices[length]
			// ����з֣���ô�����зֵõ����������ʣ�µĲ��ֵ�����
			res = Math.max(res, prices[i] + cut_recursion(prices, n - i));
		}
		return res;
	}

	// ----------------- recursion with memo top down -------------------------
	static int[] memo;

	private static int helper(int[] prices, int n) {

		if (n == 0)
			return 0;

		if (memo[n] != -1)
			return memo[n];

		int res = Integer.MIN_VALUE;

		for (int i = 1; i <= n; i++) { // i = length��Ӧ���ǲ��з֣�res = prices[length]
			// ����з֣���ô�����зֵõ����������ʣ�µĲ��ֵ�����
			res = Math.max(res, prices[i] + cut_recursion(prices, n - i));
		}

		memo[n] = res;
		return res;
	}

	public static int cut_recursion_memo(int[] prices, int n) {

		memo = new int[n + 1]; // ����0
		Arrays.fill(memo, -1);
		memo[0] = 0;

		return helper(prices, n);
	}

	// ----------------- dp: bottom up -------------------------

	public static int cut_dp(int[] prices, int n) {

		int[] dp = new int[n + 1];
		dp[0] = 0; // ������0�����ӣ��۸���0

		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= i; j++) // j����[1...i]�������
				dp[i] = Math.max(dp[i], prices[j] + dp[i - j]);

		return dp[n];
	}

	public static void main(String[] args) {

		int[] prices = { 0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30 };

//		int res = cut_recursion(prices, 5);
//		int res = cut_recursion_memo(prices, 5);
		int res = cut_dp(prices, 5);

		System.out.println(res);
	}
}
