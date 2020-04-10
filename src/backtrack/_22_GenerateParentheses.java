package backtrack;

import java.util.ArrayList;
import java.util.List;

public class _22_GenerateParentheses {

	public static List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		backtrack(res, "", 0, 0, n);
		return res;
	}

	private static void backtrack(List<String> res, String s, int open, int close, int n) {
		System.out.println(s);

		if (s.length() == n * 2) {
			res.add(s);
			System.out.println("return");
			return;
		}

		// recursion on "(" first
		if (open < n) {
			backtrack(res, s + "(", open + 1, close, n);
		}

		// if close < open < n
		if (close < open) {
			backtrack(res, s + ")", open, close + 1, n);
		}

	}

	public static void main(String[] args) {
		List<String> res = generateParenthesis(2);
		// System.out.println(res);
	}
}
