package DP;

import java.util.Arrays;

public class __1143_longestCommonSubsequence {

	public static int longestCommonSubsequence(String text1, String text2) {

		int len1 = text1.length();
		int len2 = text2.length();

		int[][] res = new int[len2 + 1][len1 + 1]; // len2+1�У�len1+1��

		for (int i = 0; i < len2 + 1; i++) // ��һ���У���Ӧtext2
			res[i][0] = 0;
		for (int j = 0; j < len1 + 1; j++) // ��һ�У���Ӧtext1
			res[0][j] = 0;

		for (int i = 1; i < len2 + 1; i++) // �ȱ���ÿ�� ,text2��
			for (int j = 1; j < len1 + 1; j++) {

				if (text2.charAt(i - 1) == text1.charAt(j - 1))
					res[i][j] = res[i - 1][j - 1] + 1;
				else
					res[i][j] = Math.max(res[i - 1][j], res[i][j - 1]);

			}

		return res[len2][len1]; // ���ؾ������½ǵ�Ԫ��
	}

	public static void main(String[] args) {
		int a = longestCommonSubsequence("helloworld", "loop");
		System.out.println(a);
	}
}
