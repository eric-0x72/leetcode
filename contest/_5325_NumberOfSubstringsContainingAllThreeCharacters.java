package contest;

import java.util.HashSet;

public class _5325_NumberOfSubstringsContainingAllThreeCharacters {

	public static int numberOfSubstrings(String s) {

		int l = 0;
		int r = 0;

		int res = 0;

		while (l < s.length() & r < s.length()) {

			String cur = s.substring(l, r+1);
			System.out.print(cur + ", ");

			if (cur.indexOf('a') != -1 && cur.indexOf('b') != -1 && cur.indexOf('c') != -1) {
				l += 1;
				res += 1;
			} else {
				r += 1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int res = numberOfSubstrings("abcdef");
		System.out.println("\r" + res);

	}
}
