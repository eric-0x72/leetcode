package DP;

public class _647_PalindromicSubstrings {

	public int countSubstrings(String s) {
		int len = s.length();
		int res = 0;

		for (int mid = 0; mid <= 2 * len - 1; mid++) {
			
			int l = mid / 2;
			int r = l + mid % 2;

			while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
				res++;
				l--;
				r++;
			}
		
		}
		return res;
	}
}
