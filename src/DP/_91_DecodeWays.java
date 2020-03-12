package DP;

import java.util.Arrays;

public class _91_DecodeWays {

	public static int numDecodings(String s) {

		if (s.charAt(0) == '0')
			return 0;

		int n = s.length();

		int[] memo = new int[n];

		memo[0] = 1;

		for (int i = 1; i < n; i++) {
			String a = s.substring(i - 1, i + 1);
			int b = Integer.parseInt(a);

			if (b == 0) // ���ŵ�����������00
				return 0;
			else if (s.charAt(i) == '0') {
				if (b <= 26) // must merge
					memo[i] = memo[i - 1];
				else
					return 0;
			} else if (b > 26 || s.charAt(i - 1) == '0') // ������merge
				memo[i] = memo[i - 1];
			else // ����merge
				memo[i] = memo[i - 1] + 1;

		}
		return memo[n - 1];
	}

	public static void main(String[] args) {

		int res = numDecodings("110");
		System.out.println(res);
//		String a = "hello world";
//		String[] b = a.split("");
//		System.out.println(Arrays.toString(b));
	}
}
