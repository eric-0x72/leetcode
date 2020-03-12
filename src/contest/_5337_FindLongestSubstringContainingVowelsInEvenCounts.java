package contest;

import java.util.HashMap;

public class _5337_FindLongestSubstringContainingVowelsInEvenCounts {

	public static int findTheLongestSubstring(String s) {
		int res = 0, cur = 0, n = s.length();

		HashMap<Integer, Integer> seen = new HashMap<>();
		seen.put(0, -1);

		for (int i = 0; i < n; ++i) {
			cur ^= 1 << ("aeiou".indexOf(s.charAt(i)) + 1) >> 1;
			
			seen.putIfAbsent(cur, i);

			res = Math.max(res, i - seen.get(cur));
			System.out.println(seen);
		}
		return res;
	}

	public static void main(String[] args) {
		int res = findTheLongestSubstring("abcdefg");
		System.out.println(res);
	}
}
