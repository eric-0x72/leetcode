package lcOffer;

import java.util.HashSet;

public class _48_LengthOfLongestSubstring {

	public int lengthOfLongestSubstring(String s) {
		int n = s.length();

		HashSet<Character> set = new HashSet<>();
		int res = 0;
		int l = 0, r = 0;

		while (l < n && r < n) {
			char left = s.charAt(r);
			char right = s.charAt(l);

			// if not contains right char, then extend to right
			if (!set.contains(left)) {
				set.add(left);
				r++;
				res = Math.max(res, r - l);
			}
			// if contains left char, then shrink left pointer
			else {
				set.remove(right);
				l++;
			}

		}
		return res;
	}

	public static void main(String[] args) {

	}
}
