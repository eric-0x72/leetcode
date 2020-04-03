package DP;

public class __1143_longestCommonSubsequence {

	public static int longestCommonSubsequence(String text1, String text2) {

		int len1 = text1.length();
		int len2 = text2.length();

		int[][] dp = new int[len2 + 1][len1 + 1];

		for (int i = 1; i <= len2; i++) {
			for (int j = 1; j <= len1; j++) {

				if (text2.charAt(i - 1) == text1.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
			}
		}
		return dp[len2][len1];
	}

	public static void main(String[] args) {
		int a = longestCommonSubsequence("helloworld", "loop");
		System.out.println(a);
	}
}
