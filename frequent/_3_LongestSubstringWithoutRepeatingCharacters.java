package frequent;

import java.util.HashSet;

public class _3_LongestSubstringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {

		HashSet<Character> set = new HashSet<>();

		int max = 0;
		int l = 0, r = 0;
		int n = s.length();

		while (l < n && r < n) {
			if (!set.contains(s.charAt(r))) {
				set.add(s.charAt(r));
				r++;
				max = Math.max(max, r - l);
			} else {
				set.remove(s.charAt(l));
				l++;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int res = lengthOfLongestSubstring("dvdf");
		System.out.println(res);
	}
}
