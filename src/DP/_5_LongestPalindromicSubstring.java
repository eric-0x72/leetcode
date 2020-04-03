package DP;

public class _5_LongestPalindromicSubstring {

	/**
	 * solution from Huahua, youtube
	 * 
	 */
	public String longestPalindrome(String s) {
		int len = 0;
		int start = 0;

		for (int i = 0; i < s.length(); i++) {

			// first is for even length
			// second is for odd length
			int curLen = Math.max(getLength(s, i, i), getLength(s, i, i + 1));

			if (curLen > len) {
				len = curLen;

				// here (curLen-1) considers the even/odd situations
				start = i - (curLen - 1) / 2;
			}
		}
		return s.substring(start, start + len);
	}

	/**
	 * expand around centre
	 * 
	 */
	private int getLength(String s, int l, int r) {
		while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			l--; // move to left
			r++; // move to right
		}
		return r - l - 1; // length not include l and r
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i / 2 + ", " + (i - 1) / 2);
		}
	}

}
