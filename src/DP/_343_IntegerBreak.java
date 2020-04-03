package DP;

public class _343_IntegerBreak {

	/**
	 * brute force, TLE
	 * 
	 */
	public int integerBreak_1(int n) {
		if (n == 1)
			return 1;

		int res = -1;
		for (int i = 1; i <= n - 1; i++) {
			res = max3(res, i * (n - i), i * integerBreak_1(n - i));
		}
		return res;
	}

	/**
	 * top down DP
	 * 
	 */
	int[] memo;

	public int integerBreak_2(int n) {
		memo = new int[n + 1]; // [0, n]
		return helper(n);
	}

	private int helper(int n) {
		if (n == 1)
			return 1;
		int res = -1;
		for (int i = 0; i <= n - 1; i++) {
			res = max3(res, i * (n - i), i * helper(n - i));
		}
		return res;
	}

	public int integerBreak_3(int n) {
		int[] memo = new int[n + 1]; // [0, n]
		memo[1] = 1;

		for (int i = 2; i <= n; i++) { // [2, n]
			for (int j = 1; j <= n - 1; j++) { // [1, n-1]
				memo[i] = max3(memo[i], j * (i - j), j * memo[i - j]);
			}
		}
		return memo[n];
	}

	private int max3(int a, int b, int c) {
		int temp = Math.max(a, b);
		return Math.max(temp, c);
	}

	public static void main(String[] args) {
		int n = 5;
		for (int i = 2; i <= n; i++) { // [2, n]
			for (int j = i; j <= n - 1; j++) { // [1, n-1]
				System.out.println(i + " " + j);
			}
		}
	}
}
