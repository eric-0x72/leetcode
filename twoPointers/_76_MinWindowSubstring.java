package twoPointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _76_MinWindowSubstring {

	// leaving for now
	public static String minWindow(String s, String t) {
		int l = 0, r = 0;
		int resl = 0, resr = 0;
		int n = s.length();

		char[] chars = t.toCharArray();
		Set<Character> targetSet = new HashSet<>();
		for (char c : chars) {
			targetSet.add(c);
		}

		Map<Character, Integer> curMap = new HashMap<>();
		int res = Integer.MAX_VALUE;

		while (r < n && l < n) {
			boolean desirable = curMap.keySet().containsAll(targetSet);

			char charR = s.charAt(r);
			char charL = s.charAt(l);
			System.out.println(charL + " " + charR);

			// not desirable, move r to right
			if (!desirable) {
				curMap.put(charR, curMap.getOrDefault(charR, 0) + 1);
				r++;
			}

			// if desirable, move l to right
			else {
				// System.out.println(curMap);

				if (r - l < res) {
					res = r - l;

					resl = l;
					resr = r;
				}

				System.out.println(curMap + ", " + charL);
				if (curMap.get(charL) <= 0) {
					curMap.remove(charL);
				} else {
					curMap.put(charL, curMap.get(charL) - 1);
				}
				l++;
			}
		}
		System.out.println("final: " + l + " " + r + ", gives: " + s.substring(resl, resr));
		return s.substring(resl, resr);
	}

	public static void main(String[] args) {
		String s = "ADOBECODEBANC", target = "ABC";
		String res = minWindow(s, target);
		System.out.println(res);
		System.out.println("done.");
//		Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
//		Set<String> set2 = new HashSet<>(Arrays.asList("a", "b", "c" , "d"));
//		System.out.println(set1);
//		System.out.println(set2);
//		System.out.println(set2.containsAll(set1));
	}

}
