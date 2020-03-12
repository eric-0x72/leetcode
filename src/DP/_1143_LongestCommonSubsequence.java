package DP;

import java.util.Arrays;

public class _1143_LongestCommonSubsequence {

	public static int longestCommonSubsequence(String text1, String text2) {

		int len1 = text1.length();
		int len2 = text2.length();

		int[][] dp = new int[len2 + 1][len1 + 1]; // 0,1, ... , n ; һ��n+1λ

		for (int i = 1; i <= len2; i++) {
			for (int j = 1; j <= len1; j++) {

				// ���i,j�������ĸƥ�䣬��ô�ۼӣ�ע��i,j��λ�ö�Ӧ��string i-1,j-1��λ��
				if (text1.charAt(j - 1) == text2.charAt(i - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[len2][len1];
	}

	public static void main(String[] args) {
		String a = "abcde";
		String b = "ace ";
		int res = longestCommonSubsequence(a, b);
		System.out.println(res);
	}

}
