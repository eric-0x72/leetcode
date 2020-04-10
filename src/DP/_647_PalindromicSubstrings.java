package dp;

public class _647_PalindromicSubstrings {

	public int countSubstrings(String s) {
		int len = s.length();
		int res = 0;

		for (int mid = 0; mid <= 2 * len - 1; mid++) {
			int l = mid / 2;
			int r = l + mid % 2;

			while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
				res++; // one more way
				l--;
				r++;
			}
		}
		return res;
	}

	public int countSubstrings_1(String s) {
		int res = 0;
		int n = s.length();

		for (int i = 0; i < n; i++) {
			// consider odd, even cases
			res += (getLength(s, i, i) + getLength(s, i, i + 1));
		}
		return res;
	}

	/**
	 * expand around centre, from Longest Palindromic Substring
	 */
	private int getLength(String s, int l, int r) {
		int res = 0;

		// within range, and first char equals last
		while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			res++;
			l--; // l pointer move to left
			r++; // r pointer move to right
		}
		return res; // length not include l and r; (l, r)
	}

	public static void main(String[] args) {

	}
}
