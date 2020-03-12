package DP;

import java.util.Arrays;

public class _322_CoinChange {

	public static int coinChange(int[] coins, int amount) {

		int[] dp = new int[amount + 1];
		// Arrays.fill(dp, Integer.MAX_VALUE);

		dp[0] = 0;

		for (int i = 1; i <= amount; i++) {

			int min = Integer.MAX_VALUE; // ��ǰtarget����СӲ������

			for (int coin : coins) {

				if (i >= coin) { // �����ǰ��target����Ӳ�ҵ����

					// ���֮ǰ����-1���жϵ�֮ǰ��-1���������coin, forloop continue
					if (dp[i - coin] == -1) {
						continue;
					} else {
						
						// ֮ǰ��dp�������coin��Ӳ��������Ҳ����dp[i-coin]+1
						min = Math.min(min, dp[i - coin]);
					}
				}
			}

			if (min == Integer.MAX_VALUE)
				dp[i] = -1;

			else
				dp[i] = min + 1;
		}

		System.out.println(Arrays.toString(dp));
		return dp[amount];
	}

	public static void main(String[] args) {

		int[] coins = { 1, 2, 5 };
		int res = coinChange(coins, 11);
		System.out.println(res);

	}
}
