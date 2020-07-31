package hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class _3_LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int res = 0;
		HashSet<Character> set = new HashSet<>();

		int n = s.length();
		int l = 0, r = 0;

		while (l < n && r < n) {
			char cur = s.charAt(r);

			// contains duplicates
			// remove left char from set, l++
			if (set.contains(cur)) {
				set.remove(s.charAt(l));
				l++;
			}

			// if no duplicates
			// set add right char, r++
			else {
				set.add(cur);
				r++;
				res = Math.max(res, r - l);
			}
		}
		return res;
	}
}
