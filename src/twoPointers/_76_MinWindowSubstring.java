package twoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class _76_MinWindowSubstring {

	// leaving for now
	public static String minWindow(String s, String target) {
		int n = s.length();

		HashSet<Character> set = new HashSet<>();
		for (char c : target.toCharArray()) {
			set.add(c);
		}

		int l = 0;
		int r = 0;
		String res = "";
		int len = Integer.MAX_VALUE;
		HashMap<Character, Integer> map = new HashMap<>();

		while (l <= n - 2 && r <= n - 2) {
			String cur = s.substring(l, r);
			boolean flag = true;

			for (char c : set) {
				if (cur.indexOf(c) == -1) {
					flag = false;
					break;
				}
			}

			// if window contains target
			if (flag) {
				map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
				l++;
			} else { // if current window not contain target
				r++;
				map.put(s.charAt(r), map.get(s.charAt(r)) + 1);
			}

			res = (l - r + 1 < len) ? cur : res;
		}
		return res;
	}

	public static void main(String[] args) {
		String S = "ADOBECODEBANC", T = "ABC";
		String res = minWindow(S, T);
		System.out.println(res);
	}

}
